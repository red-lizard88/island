package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;

import java.util.List;

import static com.javarush.island.liashchanka.animal.AnimalsMaxStepMap.animalsMaxStepMap;

public class Move {

    public static void moveAnimal(List<Animal> animalsList) {
        // Движение животных на клетках
        for (var animal : animalsList) {
            for (var animalMaxStep : animalsMaxStepMap().entrySet()) {
                if (animal.getName().equals(animalMaxStep.getKey())) {

                    if (!animal.getName().equals("Растения") || !animal.getName().equals("Гусеница")) {
                        Animal.move(animalMaxStep.getValue(), animal);
                    }
                }
            }
        }
    }
}
