package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.javarush.island.liashchanka.functions.Analytics.*;
import static com.javarush.island.liashchanka.functions.BornAnimal.makeBornAnimal;
import static com.javarush.island.liashchanka.functions.BornPlant.makeBornPlant;
import static com.javarush.island.liashchanka.functions.DeleteAnimalFromIsland.deleteAnimalFromIsland;
import static com.javarush.island.liashchanka.functions.EatAnimal.makeEatAnimal;
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


        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 4; i++) {
            executorService.execute(new TaskThreadsFunctions(animalsList, island, i));
        }

        // Рождение растений и переучет острова
        makeBornPlant(animalsList, island);

        // Животные едят и пересчитываем остров
        makeEatAnimal(animalsList, island);

        // Животные ходят и пересчитываем остров
        moveAnimal(animalsList, island);

        // Животные рождаются, после переучет острова
        makeBornAnimal(animalsList, island);

        // Удаляем умерших и отходивших животных
        deleteAnimalFromIsland(animalsList, island);

        makeAnalytics(animalsList, island);


        Thread current = Thread.currentThread();
        if(countPredatory==0 || countHerbivorous==0){ //Если 0 хищников или травоядных останавливаем программу
            current.interrupt();
            System.exit(0);
        }




    }
}
