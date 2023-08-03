package com.javarush.island.liashchanka;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;
import com.javarush.island.liashchanka.factory.AnimalFactory;
import com.javarush.island.liashchanka.factory.AnimalFactoryAbstract;

import java.security.SecureRandom;
import java.util.*;

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


        Map<Position, List<Animal>> island = new HashMap<>();




        // Создаем объекты животных на начальной арене с максимальным количеством на клетке
        islandCreate(animalsList, island);


//        for (var oneAnimal : animalsList) {
//            System.out.println(oneAnimal);
//        }


        // Вывод острова
//        for (var oneAnimal : island.entrySet()) {
//            System.out.println(oneAnimal);
//        }


        // Поедание одно животное другого, удаление съеденных и переучет на острове живых животных
          makeEatAnimal(animalsList, island);



        // Движение животных на клетках, удаление отходивших и переучет на острове живых
        moveAnimal(animalsList, island);
        moveAnimal(animalsList, island);
        moveAnimal(animalsList, island);
        moveAnimal(animalsList, island);
        moveAnimal(animalsList, island);

//        for (var animal : animalsList) {
//            for (var animalMaxStep : animalsMaxStepMap().entrySet()) {
//                if (animal.getName().equals(animalMaxStep.getKey())) {
//                    Animal.move(animalMaxStep.getValue(), animal);
//                }
//            }
//        }







        // Размножение животных с учетом максимального количества на клетке, переучет острова после размножения
        makeBornAnimal(animalsList, island);




        for (var oneAnimal : animalsList) {
            System.out.println(oneAnimal);
        }




        System.out.println("----------------------------------------------");
        // Вывод острова
//        for (var oneAnimal : island.entrySet()) {
//            System.out.println(oneAnimal);
//        }

        // Вывод животных
        System.out.println("!!!!----------------------------------------------");
        for (var oneAnimal : animalsList) {
            System.out.println(oneAnimal);
        }


    }

}