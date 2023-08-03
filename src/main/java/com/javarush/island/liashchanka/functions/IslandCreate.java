package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;
import com.javarush.island.liashchanka.factory.AnimalFactory;
import com.javarush.island.liashchanka.factory.AnimalFactoryAbstract;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.animal.AnimalsMaxCountMap.animalsMaxCountMap;
import static com.javarush.island.liashchanka.constants.Constants.areaX;
import static com.javarush.island.liashchanka.constants.Constants.areaY;

public class IslandCreate {


    // Создание острова с рождением рандомно количества животных
    public static void islandCreate (List<Animal> animalsList, Map<Position, List<Animal>> island){

        for (int i = 0; i < areaY; i++) {
            for (int j = 0; j < areaX; j++) {
                AnimalFactoryAbstract creator = new AnimalFactory();
                Position position = new Position(j, i); // Позиция животного
                List<Animal> animalsListTemp = new ArrayList<>(); // Временный лист

                for (var animalName : animalsMaxCountMap().entrySet()) {

                    // Генерим рандомное количество животных
                    SecureRandom randomCount = new SecureRandom();
                    int randomAnimalCount = randomCount.nextInt(animalName.getValue());

                    for (int m = 0; m < randomAnimalCount; m++) {
                        Animal animal = creator.createAnimal(animalName.getKey()); // Фабрика животных
                        animal.setPosition(position);
                        animal.setId(animalName.getKey() + "-" + j + i + m); // Генерация уникального id животного

                        animalsList.add(animal); // Добавляем в лист
                        animalsListTemp.add(animal); // Добавляем во временный лист

                    }

                }
                // Добавляем данные в Остров
                island.put(position, animalsListTemp);
            }
        }




    }



}
