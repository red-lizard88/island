package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;

import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.animal.AnimalsMaxStepMap.animalsMaxStepMap;
import static com.javarush.island.liashchanka.functions.DeleteAnimalFromIsland.deleteAnimalFromIsland;
import static com.javarush.island.liashchanka.functions.IslandRecalculation.makeIslandRecalculation;

public class Move {

    public static void moveAnimal(List<Animal> animalsList, Map<Position, List<Animal>> island) {
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

        // Удаление из списка съеденных или отходивших ходы животных
        //deleteAnimalFromIsland(animalsList);

        // Пересчитываем остров после хождения или размножения животных
        makeIslandRecalculation(animalsList, island);
    }
}
