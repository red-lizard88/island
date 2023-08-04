package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.constants.Constants.allMaxStep;
import static com.javarush.island.liashchanka.functions.IslandRecalculation.makeIslandRecalculation;

public class DeleteAnimalFromIsland {

    // Удаление умерших или отходивших животных с Листа
    public static void deleteAnimalFromIsland(List<Animal> animalsList, Map<Position, List<Animal>> island){
    Iterator<Animal> iterator = animalsList.iterator();
        while(iterator.hasNext()){
        Animal animal = iterator.next();
        if(!animal.isLive() || animal.getMaxStep()>= allMaxStep){
            iterator.remove();
        }
    }

        // Пересчитываем остров после хождения или размножения животных
        makeIslandRecalculation(animalsList, island);

    }

}
