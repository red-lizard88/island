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

import static com.javarush.island.liashchanka.animal.AnimalsMaxCountMap.animalsMaxCountMap;
import static com.javarush.island.liashchanka.functions.IslandRecalculation.makeIslandRecalculation;

public class BornAnimal {

    // –азмножение животных с учетом максимального количества на клетке
    public static void makeBornAnimal(List<Animal> animalsList, Map<Position, List<Animal>> island){

        for (var positionAndAnimal : island.entrySet()) {
            int countOfAnimal = 0;
            AnimalFactoryAbstract creator = new AnimalFactory();
            Map<String, List<Animal>> islandGrupByNameinPosition = new HashMap<>();

            for (var animalName : animalsMaxCountMap().entrySet()) { // »щем им€ животное и максимальное его количество
                List<Animal> animalsListTemp = new ArrayList<>();
                for (var animal : positionAndAnimal.getValue()) {
                    if (animal.getName().equals(animalName.getKey())) {
                        animalsListTemp.add(animal);
                        countOfAnimal = animalName.getValue();
                    }
                }
                islandGrupByNameinPosition.put(animalName.getKey(), animalsListTemp); // ѕромежуточный map с одной позицией одного вида животных
            }

            for (var animalName : islandGrupByNameinPosition.entrySet()) {
                SecureRandom randomAnimal = new SecureRandom();
                if((countOfAnimal - animalName.getValue().size())>0 && (countOfAnimal - animalName.getValue().size())!=1) {
                    int randomAnimalToBorn = randomAnimal.nextInt((countOfAnimal - animalName.getValue().size())); // –андомное количество животных родитьс€, но не более максимум
                    for (int m = 0; m < randomAnimalToBorn; m++) {
                        Animal animal = creator.createAnimal(animalName.getKey()); // —оздаем в фабрике рандомное количество конкретных объектов животных

                        animal.setPosition(positionAndAnimal.getKey());
                        animal.setId(animalName.getKey() + "-new-" + m + "-random-" + randomAnimalToBorn); // ”казываем уникальное id животного
                        animalsList.add(animal); // —охран€ем в лист животных
                    }
                }

            }
        }

        // ѕересчитываем остров после хождени€ или размножени€ животных
        makeIslandRecalculation(animalsList, island);


    }

}
