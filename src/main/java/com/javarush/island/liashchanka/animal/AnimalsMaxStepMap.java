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
        animalsMaxStepMap.put("Орел", 3);
        animalsMaxStepMap.put("Лошадь", 4);
        animalsMaxStepMap.put("Олень", 4);
        animalsMaxStepMap.put("Мышь", 1);
        animalsMaxStepMap.put("Коза", 3);
        animalsMaxStepMap.put("Овца", 3);
        animalsMaxStepMap.put("Кабан", 2);
        animalsMaxStepMap.put("Буйвол", 3);
        animalsMaxStepMap.put("Утка", 4);
        animalsMaxStepMap.put("Гусеница", 0);

        return animalsMaxStepMap;
    }
}
