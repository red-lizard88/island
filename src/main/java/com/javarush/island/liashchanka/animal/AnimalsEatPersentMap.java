package com.javarush.island.liashchanka.animal;

import java.util.HashMap;

public class AnimalsEatPersentMap {

    public static  HashMap<String, HashMap<String, Integer>> animalsEatPersentMap() {

        // Процент сколько каждое животное съест другое животное
        HashMap<String, Integer> wolfEatPersentMap = new HashMap<>(); // Какой процент что волк съесть другое животное
        HashMap<String, HashMap<String, Integer>> animalsEatPersentMap = new HashMap<>();
        wolfEatPersentMap.put("Волк", 0); //0
        wolfEatPersentMap.put("Удав", 0);
        wolfEatPersentMap.put("Лиса", 0);
        wolfEatPersentMap.put("Медведь", 0);
        wolfEatPersentMap.put("Орел", 0);
        wolfEatPersentMap.put("Лошадь", 10);
        wolfEatPersentMap.put("Олень", 15);
        wolfEatPersentMap.put("Кролик", 60); //60
        wolfEatPersentMap.put("Мышь", 80);
        wolfEatPersentMap.put("Коза", 60);
        wolfEatPersentMap.put("Овца", 70);
        wolfEatPersentMap.put("Кабан", 15);
        wolfEatPersentMap.put("Буйвол", 10);
        wolfEatPersentMap.put("Утка", 40);
        wolfEatPersentMap.put("Гусеница", 0);
        wolfEatPersentMap.put("Растения", 0);

        HashMap<String, Integer> rabbitEatPersentMap = new HashMap<>();
        rabbitEatPersentMap.put("Волк", 0); //0
        rabbitEatPersentMap.put("Удав", 0);
        rabbitEatPersentMap.put("Лиса", 0);
        rabbitEatPersentMap.put("Медведь", 0);
        rabbitEatPersentMap.put("Орел", 0);
        rabbitEatPersentMap.put("Лошадь", 0);
        rabbitEatPersentMap.put("Олень", 0);
        rabbitEatPersentMap.put("Кролик", 0); //0
        rabbitEatPersentMap.put("Мышь", 0);
        rabbitEatPersentMap.put("Коза", 0);
        rabbitEatPersentMap.put("Овца", 0);
        rabbitEatPersentMap.put("Кабан", 0);
        rabbitEatPersentMap.put("Буйвол", 0);
        rabbitEatPersentMap.put("Утка", 0);
        rabbitEatPersentMap.put("Гусеница", 0);
        rabbitEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> plantEatPersentMap = new HashMap<>();
        plantEatPersentMap.put("Волк", 0); //0
        plantEatPersentMap.put("Удав", 0);
        plantEatPersentMap.put("Лиса", 0);
        plantEatPersentMap.put("Медведь", 0);
        plantEatPersentMap.put("Орел", 0);
        plantEatPersentMap.put("Лошадь", 0);
        plantEatPersentMap.put("Олень", 0);
        plantEatPersentMap.put("Кролик", 0); //0
        plantEatPersentMap.put("Мышь", 0);
        plantEatPersentMap.put("Коза", 0);
        plantEatPersentMap.put("Овца", 0);
        plantEatPersentMap.put("Кабан", 0);
        plantEatPersentMap.put("Буйвол", 0);
        plantEatPersentMap.put("Утка", 0);
        plantEatPersentMap.put("Гусеница", 0);
        plantEatPersentMap.put("Растения", 0); //0


        animalsEatPersentMap.put("Волк", wolfEatPersentMap);
        animalsEatPersentMap.put("Кролик", rabbitEatPersentMap);
        animalsEatPersentMap.put("Растения", plantEatPersentMap);

        return animalsEatPersentMap;
    }

}
