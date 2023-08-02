package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;

import java.util.List;

import static com.javarush.island.liashchanka.animal.AnimalsMaxStepMap.animalsMaxStepMap;

public class Move {

    public static void moveAnimal(List<Animal> animalsList) {
        // Движение животных на клетках
        for (var animal : animalsList) {
            for (var animalMaxStep : animalsMaxStepMap().entrySet()) {
                if (animal.getName().equals(animalMaxStep.getKey())) { // Если не растения и не гусеница, то двигаемся
                    boolean isPlant = false;
                    boolean isGus = false;
                    isPlant = animal.getName().equals("Растения");
                    isGus = animal.getName().equals("Гусеница");
                    if (!isPlant && !isGus) {
                        Animal.move(animalMaxStep.getValue(), animal);
                    }
                }
            }
        }
    }
}
