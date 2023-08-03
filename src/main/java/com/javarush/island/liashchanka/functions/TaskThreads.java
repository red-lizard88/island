package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;

import java.util.*;

import static com.javarush.island.liashchanka.functions.BornAnimal.makeBornAnimal;
import static com.javarush.island.liashchanka.functions.EatAnimal.makeEatAnimal;
import static com.javarush.island.liashchanka.functions.IslandCreate.islandCreate;
import static com.javarush.island.liashchanka.functions.Move.moveAnimal;

public class TaskThreads implements Runnable {


    volatile List<Animal> animalsList;
    volatile Map<Position, List<Animal>> island;

    public TaskThreads(List<Animal> animalsList, Map<Position, List<Animal>> island) {
        this.animalsList = animalsList;
        this.island = island;
    }


    public List<Animal> getAnimalsList() {
        return animalsList;
    }

    public void setAnimalsList(List<Animal> animalsList) {
        this.animalsList = animalsList;
    }

    public Map<Position, List<Animal>> getIsland() {
        return island;
    }

    public void setIsland(Map<Position, List<Animal>> island) {
        this.island = island;
    }


    @Override
    public void run() {

        // Животные едят, после этого удаляем умерших и отходивших животных и пересчитываем остров
        makeEatAnimal(animalsList, island);


        // Животные ходят, после этого удаляем умерших и отходивших животных и пересчитываем остров
        moveAnimal(animalsList, island);


        // Животные рождаются, после переучет острова
        makeBornAnimal(animalsList, island);


        System.out.println("@@--------------------------------------------------");
        Iterator<Animal> iterator = animalsList.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal);
        }


//        System.out.println("@@--------------------------------------------------");
//        for (var oneAnimal : animalsList) {
//            System.out.println(oneAnimal);
//        }

    }
}
