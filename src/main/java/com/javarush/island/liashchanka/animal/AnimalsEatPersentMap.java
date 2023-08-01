package com.javarush.island.liashchanka.animal;

import java.util.HashMap;

public class AnimalsEatPersentMap {

    public static HashMap<String, HashMap<String, Integer>> animalsEatPersentMap() {

        // Процент сколько каждое животное съест другое животное
        HashMap<String, Integer> wolfEatPersentMap = new HashMap<>(); // Какой процент что волк съесть другое животное
        wolfEatPersentMap.put("Волк", 0);
        wolfEatPersentMap.put("Удав", 0);
        wolfEatPersentMap.put("Лиса", 0);
        wolfEatPersentMap.put("Медведь", 0);
        wolfEatPersentMap.put("Орел", 0);
        wolfEatPersentMap.put("Лошадь", 10);
        wolfEatPersentMap.put("Олень", 15);
        wolfEatPersentMap.put("Кролик", 60);
        wolfEatPersentMap.put("Мышь", 80);
        wolfEatPersentMap.put("Коза", 60);
        wolfEatPersentMap.put("Овца", 70);
        wolfEatPersentMap.put("Кабан", 15);
        wolfEatPersentMap.put("Буйвол", 10);
        wolfEatPersentMap.put("Утка", 40);
        wolfEatPersentMap.put("Гусеница", 0);
        wolfEatPersentMap.put("Растения", 0);

        HashMap<String, Integer> rabbitEatPersentMap = new HashMap<>();
        wolfEatPersentMap.put("Волк", 0);
        wolfEatPersentMap.put("Удав", 0);
        wolfEatPersentMap.put("Лиса", 0);
        wolfEatPersentMap.put("Медведь", 0);
        wolfEatPersentMap.put("Орел", 0);
        wolfEatPersentMap.put("Лошадь", 0);
        wolfEatPersentMap.put("Олень", 0);
        wolfEatPersentMap.put("Кролик", 0);
        wolfEatPersentMap.put("Мышь", 0);
        wolfEatPersentMap.put("Коза", 0);
        wolfEatPersentMap.put("Овца", 0);
        wolfEatPersentMap.put("Кабан", 0);
        wolfEatPersentMap.put("Буйвол", 0);
        wolfEatPersentMap.put("Утка", 0);
        wolfEatPersentMap.put("Гусеница", 0);
        wolfEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> plantEatPersentMap = new HashMap<>();
        wolfEatPersentMap.put("Волк", 0);
        wolfEatPersentMap.put("Удав", 0);
        wolfEatPersentMap.put("Лиса", 0);
        wolfEatPersentMap.put("Медведь", 0);
        wolfEatPersentMap.put("Орел", 0);
        wolfEatPersentMap.put("Лошадь", 0);
        wolfEatPersentMap.put("Олень", 0);
        wolfEatPersentMap.put("Кролик", 0);
        wolfEatPersentMap.put("Мышь", 0);
        wolfEatPersentMap.put("Коза", 0);
        wolfEatPersentMap.put("Овца", 0);
        wolfEatPersentMap.put("Кабан", 0);
        wolfEatPersentMap.put("Буйвол", 0);
        wolfEatPersentMap.put("Утка", 0);
        wolfEatPersentMap.put("Гусеница", 0);
        wolfEatPersentMap.put("Растения", 0);

        HashMap<String, HashMap<String, Integer>> animalsEatPersentMap = new HashMap<>();
        animalsEatPersentMap.put("Волк", wolfEatPersentMap);
        animalsEatPersentMap.put("Кролик", rabbitEatPersentMap);
        animalsEatPersentMap.put("Растения", plantEatPersentMap);

        return animalsEatPersentMap;
    }

}
