package com.javarush.island.liashchanka.animal;

import java.util.HashMap;

public class AnimalsMaxStepMap {




    public static HashMap<String, Integer> animalsMaxStepMap() {

        // Максимальный шаг у каждого животного
        HashMap<String, Integer> animalsMaxStepMap = new HashMap<>();
        animalsMaxStepMap.put("Волк", 3);
        animalsMaxStepMap.put("Кролик", 2);
        animalsMaxStepMap.put("Растения", 0);
        animalsMaxStepMap.put("Удав", 1);
        animalsMaxStepMap.put("Лиса", 2);
        animalsMaxStepMap.put("Медведь", 2);

        return animalsMaxStepMap;
    }
}
