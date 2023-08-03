package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.functions.DeleteAnimalFromIsland.deleteAnimalFromIsland;
import static com.javarush.island.liashchanka.functions.IslandRecalculation.makeIslandRecalculation;

public class EatAnimal {


    // Поедание одно животное другого
    public static void makeEatAnimal(List<Animal> animalsList, Map<Position, List<Animal>> island) {
        for (var positionAndAnimal : island.entrySet()) {
            for (var animal : positionAndAnimal.getValue()) {

                SecureRandom randomAnimal = new SecureRandom();
                int positionRandom = positionAndAnimal.getValue().size();
                int randomAnimalToEat = randomAnimal.nextInt(positionRandom); //Рандомное животное из листа в нашей Позиции

                Animal meEatAnimal = positionAndAnimal.getValue().get(randomAnimalToEat);
                if (meEatAnimal.isLive()) {  // Если животное живое пробуем съесть
                    Animal.eat(animal, meEatAnimal);
                }
            }
        }

        // Удаление из списка съеденных или отходивших ходы животных
        deleteAnimalFromIsland(animalsList);

        // Пересчитываем остров после хождения или размножения животных
        makeIslandRecalculation(animalsList, island);

    }

}
