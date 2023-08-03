package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.constants.Constants.areaX;
import static com.javarush.island.liashchanka.constants.Constants.areaY;

public class IslandRecalculation {

    // Переучет устрова
    public static void makeIslandRecalculation(List<Animal> animalsList, Map<Position, List<Animal>>  island){

        for (int i = 0; i < areaY; i++) {
            for (int j = 0; j < areaX; j++) {
                List<Animal> animalsListTemp = new ArrayList<>();

                for (var animal : animalsList) {
                    if (animal.getPosition().getX() == j && animal.getPosition().getY() == i) {
                        animalsListTemp.add(animal);
                    }
                }

                for (var positionAndAnimal : island.entrySet()) {
                    if (positionAndAnimal.getKey().getX() == j && positionAndAnimal.getKey().getY() == i) {
                        island.put(positionAndAnimal.getKey(), animalsListTemp);
                    }
                }

            }
        }


    }

}
