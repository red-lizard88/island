package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;

import java.util.Iterator;
import java.util.List;

import static com.javarush.island.liashchanka.constants.Constants.allMaxStep;

public class DeleteAnimalFromIsland {

    // Удаление из списка съеденных или отходивших ходы животных
    public static void deleteAnimalFromIsland(List<Animal> animalsList){
    Iterator<Animal> iterator = animalsList.iterator();
        while(iterator.hasNext()){
        Animal animal = iterator.next();
        if(!animal.isLive() || animal.getMaxStep()>= allMaxStep){
            iterator.remove();
        }

    }
    }

}
