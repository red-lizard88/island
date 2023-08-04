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

        List<Animal> animalsList = new ArrayList<>();
//
//
        Map<Position, List<Animal>> island = new HashMap<>();




        // Создаем объекты животных на начальной арене с максимальным количеством на клетке
         islandCreate(animalsList, island);

      //  makeEatAnimal(animalsList, island);
//        for (var oneAnimal : animalsList) {
//            System.out.println(oneAnimal);
//        }

//        Iterator<Animal> iterator = animalsList.iterator();
//        while(iterator.hasNext()) {
//            Animal animal = iterator.next();
//            System.out.println(animal);
//        }

        TaskThreads taskThreads = new TaskThreads(animalsList, island);
//        Thread thread1 = new Thread(taskThreads);
//        thread1.start();
//
//        Thread thread2 = new Thread(taskThreads);
//        thread2.start();

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        executorService.scheduleAtFixedRate(taskThreads, 0, periodSeconds, TimeUnit.SECONDS);

        //  System.out.println("\uD83D\uDC3B");

//        System.out.println("@@--------------------------------------------------");
//        for (var oneAnimal : taskThreads.getAnimalsList()) {
//            System.out.println(oneAnimal);
//        }
//
//
////        for (var oneAnimal : animalsList) {
////            System.out.println(oneAnimal);
////        }
//
//
//        // Вывод острова
////        for (var oneAnimal : island.entrySet()) {
////            System.out.println(oneAnimal);
////        }
//
//
//        // Поедание одно животное другого, удаление съеденных и переучет на острове живых животных
//          makeEatAnimal(animalsList, island);
//
//
//
//        // Движение животных на клетках, удаление отходивших и переучет на острове живых
//        moveAnimal(animalsList, island);
//        moveAnimal(animalsList, island);
//        moveAnimal(animalsList, island);
//        moveAnimal(animalsList, island);
//        moveAnimal(animalsList, island);
//
////        for (var animal : animalsList) {
////            for (var animalMaxStep : animalsMaxStepMap().entrySet()) {
////                if (animal.getName().equals(animalMaxStep.getKey())) {
////                    Animal.move(animalMaxStep.getValue(), animal);
////                }
////            }
////        }
//
//
//
//
//
//
//
//        // Размножение животных с учетом максимального количества на клетке, переучет острова после размножения
//        makeBornAnimal(animalsList, island);




//        for (var oneAnimal : animalsList) {
//            System.out.println(oneAnimal);
//        }




     //   System.out.println("----------------------------------------------");
        // Вывод острова
//        for (var oneAnimal : island.entrySet()) {
//            System.out.println(oneAnimal);
//        }

        // Вывод животных
//        System.out.println("!!!!----------------------------------------------");
//        for (var oneAnimal : animalsList) {
//            System.out.println(oneAnimal);
//        }


    }

}