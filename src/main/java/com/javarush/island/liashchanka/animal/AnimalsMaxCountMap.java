package com.javarush.island.liashchanka.animal;

import java.util.HashMap;

public class AnimalsMaxCountMap {


    public static HashMap<String, Integer> animalsMaxCountMap() {

        // Максимальное количество животных на одной клетке
        HashMap<String, Integer> animalsMaxCountMap = new HashMap<>();
        animalsMaxCountMap.put("Волк", 5); //30
        animalsMaxCountMap.put("Кролик", 5); //150
        animalsMaxCountMap.put("Растения", 5); //200


        return animalsMaxCountMap;
    }

}
