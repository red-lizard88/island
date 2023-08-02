package com.javarush.island.liashchanka;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;
import com.javarush.island.liashchanka.factory.AnimalFactory;
import com.javarush.island.liashchanka.factory.AnimalFactoryAbstract;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.animal.AnimalsEatPersentMap.animalsEatPersentMap;
import static com.javarush.island.liashchanka.animal.AnimalsMaxCountMap.animalsMaxCountMap;
import static com.javarush.island.liashchanka.animal.AnimalsMaxStepMap.animalsMaxStepMap;
import static com.javarush.island.liashchanka.constants.Constants.areaX;
import static com.javarush.island.liashchanka.constants.Constants.areaY;

public class Main {

    public static void main(String[] args) {

        //  List<String> animalsNameList = Arrays.asList("Волк", "Кролик");


        List<Animal> animalsList = new ArrayList<>();


        Map<Position, List<Animal>> island = new HashMap<>();


        AnimalFactoryAbstract creator = new AnimalFactory();
//        Animal ilya = creator.createAnimal("Волк");
//
//        Animal ann = creator.createAnimal("Кролик");

        //System.out.println("Start: " + ilya);
        // System.out.println("Start: " + ann);


//        for (int i = 0; i < 10; i++) {
//
//        Position newPosition = ilya.move(ilya.getPosition());
//        Position newPosition2 = ann.move(ann.getPosition());
//        ilya.setPosition(newPosition);
//        ann.setPosition(newPosition2);
//
//        System.out.println("End: " + ilya);
//        System.out.println("End: " + ann);
//        }


        // Создаем объекты животных на начальной арене с максимальным количеством на клетке
        for (int i = 0; i < areaY; i++) { // идем по строкам
            for (int j = 0; j < areaX; j++) { // идем по столбцам
                Position position = new Position(j, i); // Записываем позицию
                List<Animal> animalsListTemp = new ArrayList<>(); // Создаем временный остров

                for (var animalName : animalsMaxCountMap().entrySet()) {

                    // Рандомное количество животных на клетке
                    SecureRandom randomCount = new SecureRandom();
                    int randomAnimalCount = randomCount.nextInt(animalName.getValue());

                    for (int m = 0; m < randomAnimalCount; m++) {
                        Animal animal = creator.createAnimal(animalName.getKey()); // Создаем в фабрике рандомное количество конкретных объектов животных
                        animal.setPosition(position);
                        animal.setId(animalName.getKey() + "-" + j + i + m); // Указываем уникальное id животного

                        animalsList.add(animal); // Сохраняем в лист животных
                        animalsListTemp.add(animal); // Сохраняем во временный лист для острова

                    }

                }
                // Добавляем в остров на конкретную позицию конкретный лист животных
                island.put(position, animalsListTemp);
            }
        }


//        for (var oneAnimal : animalsList) {
//            System.out.println(oneAnimal);
//        }


        // Вывод острова
//        for (var oneAnimal : island.entrySet()) {
//            System.out.println(oneAnimal);
//        }


        // Поедание одно животное другого
    //    for (int i = 0; i < 100; i++) {
            for (var positionAndAnimal : island.entrySet()) {
                for (var animal : positionAndAnimal.getValue()) {

                    SecureRandom randomAnimal = new SecureRandom();
                    int positionRandom = positionAndAnimal.getValue().size();
                    int randomAnimalToEat = randomAnimal.nextInt(positionRandom); //Рандомное животное из листа в нашей Позиции
                   // for (int j = 0; j < 1000; j++) {
                       Animal meEatAnimal = positionAndAnimal.getValue().get(randomAnimalToEat);
                        if (meEatAnimal.isLive()) {  // Если животное живое пробуем съесть
                            Animal.eat(animal, meEatAnimal);
                        }
                       // randomAnimalToEat = randomAnimal.nextInt(positionAndAnimal.getValue().size());
                        // }
                }
            }
     //   }


        // Размножение животных с учетом максимального количества на клетке
        for (var positionAndAnimal : island.entrySet()) {
            int countOfAnimal = 0;

            Map<String, List<Animal>> islandGrupByNameinPosition = new HashMap<>();

            for (var animalName : animalsMaxCountMap().entrySet()) { // Ищем имя животное и максимальное его количество
                List<Animal> animalsListTemp = new ArrayList<>();
                for (var animal : positionAndAnimal.getValue()) {
                    if (animal.getName().equals(animalName.getKey())) {
                        animalsListTemp.add(animal);
                        countOfAnimal = animalName.getValue();
                    }
                }
                islandGrupByNameinPosition.put(animalName.getKey(), animalsListTemp); // Промежуточный map с одной позицией одного вида животных
            }

            for (var animalName : islandGrupByNameinPosition.entrySet()) {
                SecureRandom randomAnimal = new SecureRandom();
                if((countOfAnimal - animalName.getValue().size())>0) {
                    int randomAnimalToBorn = randomAnimal.nextInt((countOfAnimal - animalName.getValue().size())); // Рандомное количество животных родиться, но не более максимум
                    for (int m = 0; m < randomAnimalToBorn; m++) {
                        Animal animal = creator.createAnimal(animalName.getKey()); // Создаем в фабрике рандомное количество конкретных объектов животных

                        animal.setPosition(positionAndAnimal.getKey());
                        animal.setId(animalName.getKey() + "-new-" + m + "-random-" + randomAnimalToBorn); // Указываем уникальное id животного
//
                        animalsList.add(animal); // Сохраняем в лист животных
                    }
                }

            }

        }


        // for (var animalsEatPersent : animalsEatPersentMap().entrySet()) {
        //if (animal.getName().equals(animalsEatPersent.getKey())) {
        // System.out.println("Совпали "+animal);


        // Position ourPosition = new Position(0,0);
        //Animal.eat(animal, );
        // System.out.println("Совпали после движения "+animal);
        //    }


        //Map<Position, List<Animal>> island = new HashMap<>();
        // Движение животных на клетках через Остров
//        for (var positionAndAnimal : island.entrySet()) {
//            List<Animal> animalsListTemp = new ArrayList<>(); // Создаем временный остров
//
//            for (var animal : positionAndAnimal.getValue()) { // Выбираем одно животное для хода
//                for (var animalMaxStep : animalsMaxStepMap().entrySet()) { // Проверяем максимальный ход животного
//                    if (animal.getName().equals(animalMaxStep.getKey())) {
//                        Animal.move(animalMaxStep.getValue(), animal); // Ходим животным
//
//                        animalsListTemp.add(animal);
//                        System.out.println("Походил"+animal);
//                    }
//                }
//
//
//                if (positionAndAnimal.getKey().hashCode() == animal.getPosition().hashCode()){
//
//                }
//            }
//            island.put(positionAndAnimal.getKey(), animalsListTemp);
//        }


//        for (var oneAnimal : animalsList) {
//            System.out.println(oneAnimal);
//        }


        // Движение животных на клетках
        for (var animal : animalsList) {
            for (var animalMaxStep : animalsMaxStepMap().entrySet()) {
                if (animal.getName().equals(animalMaxStep.getKey())) {
                    Animal.move(animalMaxStep.getValue(), animal);
                }
            }
        }

        // Пересчитываем остров после хождения животных
        for (int i = 0; i < areaY; i++) { // идем по строкам
            for (int j = 0; j < areaX; j++) { // идем по столбцам
                List<Animal> animalsListTemp = new ArrayList<>(); // Создаем временный остров

                for (var animal : animalsList) {
                    if (animal.getPosition().getX() == j && animal.getPosition().getY() == i) {
                        animalsListTemp.add(animal);
                    }
                }

                for (var positionAndAnimal : island.entrySet()) {
                    if (positionAndAnimal.getKey().getX() == j && positionAndAnimal.getKey().getY() == i) {
                        island.put(positionAndAnimal.getKey(), animalsListTemp);
                    }
                }

            }
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