package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;
import com.javarush.island.liashchanka.factory.AnimalFactory;
import com.javarush.island.liashchanka.factory.AnimalFactoryAbstract;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static com.javarush.island.liashchanka.animal.AnimalsMaxCountMap.animalsMaxCountMap;
import static com.javarush.island.liashchanka.constants.Constants.BornFromMin;
import static com.javarush.island.liashchanka.functions.IslandRecalculation.makeIslandRecalculation;

public class BornAnimal {

    //Рождение животных в конце переучет острова
    public static void makeBornAnimal(List<Animal> animalsList, Map<Position, List<Animal>> island){

        for (var positionAndAnimal : island.entrySet()) {
            int countOfAnimal = 0;
            AnimalFactoryAbstract creator = new AnimalFactory();
            Map<String, List<Animal>> islandGrupByNameinPosition = new HashMap<>();

            for (var animalName : animalsMaxCountMap().entrySet()) { // Сколько максимум животных на карте
                List<Animal> animalsListTemp = new ArrayList<>();
                for (var animal : positionAndAnimal.getValue()) {
                    if (animal.getName().equals(animalName.getKey())) {
                        animalsListTemp.add(animal);
                        countOfAnimal = animalName.getValue();
                    }
                }
                islandGrupByNameinPosition.put(animalName.getKey(), animalsListTemp); // Группировка
            }

            for (var animalName : islandGrupByNameinPosition.entrySet()) {

                if(animalName.getValue().size()!= BornFromMin) {
                    int countToBorn = (int) animalName.getValue().size()/2; // Сколько рандомно создаем животных
                    for (int m = 0; m < countToBorn; m++) {
                        Animal animal = creator.createAnimal(animalName.getKey()); // Фабрика по созданию животных

                        animal.setPosition(positionAndAnimal.getKey());
                        animal.setId(animalName.getKey() + "-new-" + m + "-child-" + countToBorn); // Написание уникальное id
                        animalsList.add(animal); // добавляет животное в лист
                    }
                }

            }


//            Старый метод рождения, где рандомно вбырается количество детей
//            for (var animalName : islandGrupByNameinPosition.entrySet()) {
//                var randomAnimal = ThreadLocalRandom.current();
//                // SecureRandom randomAnimal = new SecureRandom();
//                if((countOfAnimal - animalName.getValue().size())>0 && (countOfAnimal - animalName.getValue().size())!= BornFromMin) {
//                    int randomAnimalToBorn = randomAnimal.nextInt((countOfAnimal - animalName.getValue().size())); // Сколько рандомно создаем животных
//                    for (int m = 0; m < randomAnimalToBorn; m++) {
//                        Animal animal = creator.createAnimal(animalName.getKey()); // Фабрика по созданию животных
//
//                        animal.setPosition(positionAndAnimal.getKey());
//                        animal.setId(animalName.getKey() + "-new-" + m + "-random-" + randomAnimalToBorn); // Написание уникальное id
//                        animalsList.add(animal); // добавляет животное в лист
//                    }
//                }
//
//            }




        }

        // Переучет острова
        makeIslandRecalculation(animalsList, island);


    }

}
