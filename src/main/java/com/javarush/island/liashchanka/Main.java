package com.javarush.island.liashchanka;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;
import com.javarush.island.liashchanka.factory.AnimalFactory;
import com.javarush.island.liashchanka.factory.AnimalFactoryAbstract;
import com.javarush.island.liashchanka.functions.TaskThreads;

import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static com.javarush.island.liashchanka.animal.AnimalsEatPersentMap.animalsEatPersentMap;
import static com.javarush.island.liashchanka.animal.AnimalsMaxCountMap.animalsMaxCountMap;
import static com.javarush.island.liashchanka.animal.AnimalsMaxStepMap.animalsMaxStepMap;
import static com.javarush.island.liashchanka.constants.Constants.*;
import static com.javarush.island.liashchanka.functions.BornAnimal.makeBornAnimal;
import static com.javarush.island.liashchanka.functions.EatAnimal.makeEatAnimal;
import static com.javarush.island.liashchanka.functions.IslandCreate.islandCreate;
import static com.javarush.island.liashchanka.functions.IslandRecalculation.makeIslandRecalculation;
import static com.javarush.island.liashchanka.functions.Move.moveAnimal;

public class Main {

    public static void main(String[] args) {

        // Наш остров и список животных в Листе (они должны совпадать):)
        List<Animal> animalsList = new ArrayList<>();
        Map<Position, List<Animal>> island = new HashMap<>();




        // Создаем объекты животных на начальной арене
         islandCreate(animalsList, island);


        TaskThreads taskThreads = new TaskThreads(animalsList, island);


        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(taskThreads, 0, periodSeconds, TimeUnit.SECONDS); //periodSeconds

        //  System.out.println("\uD83D\uDC3B");







    }

}