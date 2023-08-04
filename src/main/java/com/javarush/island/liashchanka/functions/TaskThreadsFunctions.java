package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.functions.BornAnimal.makeBornAnimal;
import static com.javarush.island.liashchanka.functions.BornPlant.makeBornPlant;
import static com.javarush.island.liashchanka.functions.DeleteAnimalFromIsland.deleteAnimalFromIsland;
import static com.javarush.island.liashchanka.functions.EatAnimal.makeEatAnimal;
import static com.javarush.island.liashchanka.functions.Move.moveAnimal;

public class TaskThreadsFunctions implements Runnable{

    public TaskThreadsFunctions(List<Animal> animalsList, Map<Position, List<Animal>> island, int numberFunctions) {
        this.animalsList = animalsList;
        this.island = island;
        this.numberFunctions = numberFunctions;
    }

    volatile List<Animal> animalsList;
    volatile Map<Position, List<Animal>> island;
    private int numberFunctions;


    @Override
    public void run() {

        switch (numberFunctions) {

            // Рождение растений и переучет острова
            case 0 -> makeBornPlant(animalsList, island);

            // Животные едят и пересчитываем остров
            case 1 -> makeEatAnimal(animalsList, island);

            // Животные ходят и пересчитываем остров
            case 2 -> moveAnimal(animalsList, island);

            // Животные рождаются, после переучет острова
            case 3 -> makeBornAnimal(animalsList, island);

            // Удаляем умерших и отходивших животных
            case 4 -> deleteAnimalFromIsland(animalsList, island);


        }
    }
}
