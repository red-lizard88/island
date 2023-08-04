package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.animal.AnimalsEatPersentMap.animalsEatPersentMap;
import static com.javarush.island.liashchanka.functions.DeleteAnimalFromIsland.deleteAnimalFromIsland;
import static com.javarush.island.liashchanka.functions.IslandRecalculation.makeIslandRecalculation;

public class EatAnimal {


    // Поедание одно животное другого
    public static void makeEatAnimal(List<Animal> animalsList, Map<Position, List<Animal>> island) {
        for (var positionAndAnimal : island.entrySet()) {
            for (var animal : positionAndAnimal.getValue()) {

                for (var animalEatAndNamePersent : animalsEatPersentMap().entrySet()) {

                    if (animal.getName().equals(animalEatAndNamePersent.getKey())) {
                        int countOfEat=0; // Съедаем только одно животное
                        for (var animalMeEat : positionAndAnimal.getValue()) {
                            for (var animalNameMeEat : animalEatAndNamePersent.getValue().entrySet() ){
                                if (animalMeEat.getName().equals(animalNameMeEat.getKey()) && animalNameMeEat.getValue() > 0 && countOfEat==0) {
                                    if (animalMeEat.isLive()) {  // Если животное живое поедаем его
                                        Animal.eat(animal, animalMeEat);
                                        countOfEat = 1;
                                    }
                                }


                            }

                        }
                    }
                }

            }
        }

// Старый метод поедания рандомного животного
//        for (var positionAndAnimal : island.entrySet()) {
//            for (var animal : positionAndAnimal.getValue()) {
//
//                SecureRandom randomAnimal = new SecureRandom();
//                int positionRandom = positionAndAnimal.getValue().size();
//                int randomAnimalToEat = randomAnimal.nextInt(positionRandom); //Поедание рандомного животного
//
//                Animal meEatAnimal = positionAndAnimal.getValue().get(randomAnimalToEat);
//                if (meEatAnimal.isLive()) {  // Если животное живое поедаем его
//                    Animal.eat(animal, meEatAnimal);
//                }
//            }
//        }
//----------------------------
        // Удаление умерших и отходивших животных
//         deleteAnimalFromIsland(animalsList);

        // Переучет острова
        makeIslandRecalculation(animalsList, island);

    }

}
