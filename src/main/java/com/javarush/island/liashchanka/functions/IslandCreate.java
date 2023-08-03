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


    // Создаем объекты животных на начальной арене с максимальным количеством на клетке
    public static void islandCreate (List<Animal> animalsList, Map<Position, List<Animal>> island){

        for (int i = 0; i < areaY; i++) { // идем по строкам
            for (int j = 0; j < areaX; j++) { // идем по столбцам
                AnimalFactoryAbstract creator = new AnimalFactory();
                Position position = new Position(j, i); // Записываем позицию
                List<Animal> animalsListTemp = new ArrayList<>(); // Создаем временный остров

                for (var animalName : animalsMaxCountMap().entrySet()) {

                    // Рандомное количество животных на клетке
                    SecureRandom randomCount = new SecureRandom();
                    int randomAnimalCount = randomCount.nextInt(animalName.getValue());

                    for (int m = 0; m < randomAnimalCount; m++) {
                        Animal animal = creator.createAnimal(animalName.getKey()); // Создаем в фабрике рандомное количество конкретных объектов животных
                        animal.setPosition(position);
                        animal.setId(animalName.getKey() + "-" + j + i + m); // Указываем уникальное id животного

                        animalsList.add(animal); // Сохраняем в лист животных
                        animalsListTemp.add(animal); // Сохраняем во временный лист для острова

                    }

                }
                // Добавляем в остров на конкретную позицию конкретный лист животных
                island.put(position, animalsListTemp);
            }
        }




    }



}
