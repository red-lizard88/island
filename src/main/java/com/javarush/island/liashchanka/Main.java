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
        for (int i = 0; i < areaY; i++) { // идем по строка
            for (int j = 0; j < areaX; j++) { // идем по столбцам
                Position position = new Position(j, i); // Записываем позицию
                List<Animal> animalsListTemp = new ArrayList<>(); // Создаем временный остров

                for (var animalName : animalsMaxCountMap().entrySet()) {

                    // Рандомное количетсво животных на клетке
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
        for (var oneAnimal : island.entrySet()) {
            System.out.println(oneAnimal);
        }


        // Поедание одно животное другого
        for (var oneAnimal : animalsList) {
         //   if(oneAnimal.getPosition())

            
            
                //System.out.println("Поедание");
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

        // Изменяем остров после хождения животных
        for (int i = 0; i < areaY; i++) { // идем по строкам
            for (int j = 0; j < areaX; j++) { // идем по столбцам
                List<Animal> animalsListTemp = new ArrayList<>(); // Создаем временный остров

                for (var animal : animalsList) {
                    if(animal.getPosition().getX() ==j && animal.getPosition().getY()==i){
                        animalsListTemp.add(animal);
                    }
                }

                for (var positionAndAnimal : island.entrySet()) {
                    if(positionAndAnimal.getKey().getX()==j && positionAndAnimal.getKey().getY()==i){
                        island.put(positionAndAnimal.getKey(), animalsListTemp);
                    }

                }


            }
        }




        System.out.println("----------------------------------------------");
        // Вывод острова
        for (var oneAnimal : island.entrySet()) {
            System.out.println(oneAnimal);
        }



//        for (var oneAnimal : animalsList) {
//            System.out.println(oneAnimal);
//        }


    }

}