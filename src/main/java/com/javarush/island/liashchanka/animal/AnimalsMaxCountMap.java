package com.javarush.island.liashchanka.animal;

import java.util.HashMap;

public class AnimalsMaxCountMap {


    public static HashMap<String, Integer> animalsMaxCountMap() {

        // Максимальное количество животных на одной клетке
        HashMap<String, Integer> animalsMaxCountMap = new HashMap<>();
        animalsMaxCountMap.put("Волк", 150); //30
        animalsMaxCountMap.put("Кролик", 300); //150
        animalsMaxCountMap.put("Растения", 100); //200


        return animalsMaxCountMap;
    }

}
