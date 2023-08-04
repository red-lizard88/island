package com.javarush.island.liashchanka.animal;

import java.util.HashMap;

public class AnimalsEatPersentMap {

    public static  HashMap<String, HashMap<String, Integer>> animalsEatPersentMap() {

        // Процент сколько каждое животное съест другое животное
        HashMap<String, Integer> wolfEatPersentMap = new HashMap<>(); // Какой процент что волк съесть другое животное
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

        HashMap<String, Integer> boaEatPersentMap = new HashMap<>();
        boaEatPersentMap.put("Волк", 0); //0
        boaEatPersentMap.put("Удав", 0);
        boaEatPersentMap.put("Лиса", 15);
        boaEatPersentMap.put("Медведь", 0);
        boaEatPersentMap.put("Орел", 0);
        boaEatPersentMap.put("Лошадь", 0);
        boaEatPersentMap.put("Олень", 0);
        boaEatPersentMap.put("Кролик", 20); //0
        boaEatPersentMap.put("Мышь", 40);
        boaEatPersentMap.put("Коза", 0);
        boaEatPersentMap.put("Овца", 0);
        boaEatPersentMap.put("Кабан", 0);
        boaEatPersentMap.put("Буйвол", 0);
        boaEatPersentMap.put("Утка", 10);
        boaEatPersentMap.put("Гусеница", 0);
        boaEatPersentMap.put("Растения", 0); //0

        HashMap<String, Integer> foxEatPersentMap = new HashMap<>();
        foxEatPersentMap.put("Волк", 0); //0
        foxEatPersentMap.put("Удав", 0);
        foxEatPersentMap.put("Лиса", 0);
        foxEatPersentMap.put("Медведь", 0);
        foxEatPersentMap.put("Орел", 0);
        foxEatPersentMap.put("Лошадь", 0);
        foxEatPersentMap.put("Олень", 0);
        foxEatPersentMap.put("Кролик", 70); //0
        foxEatPersentMap.put("Мышь", 90);
        foxEatPersentMap.put("Коза", 0);
        foxEatPersentMap.put("Овца", 0);
        foxEatPersentMap.put("Кабан", 0);
        foxEatPersentMap.put("Буйвол", 0);
        foxEatPersentMap.put("Утка", 60);
        foxEatPersentMap.put("Гусеница", 40);
        foxEatPersentMap.put("Растения", 0); //0

        HashMap<String, Integer> bearEatPersentMap = new HashMap<>();
        bearEatPersentMap.put("Волк", 0); //0
        bearEatPersentMap.put("Удав", 80);
        bearEatPersentMap.put("Лиса", 0);
        bearEatPersentMap.put("Медведь", 0);
        bearEatPersentMap.put("Орел", 0);
        bearEatPersentMap.put("Лошадь", 40);
        bearEatPersentMap.put("Олень", 80);
        bearEatPersentMap.put("Кролик", 80);
        bearEatPersentMap.put("Мышь", 90);
        bearEatPersentMap.put("Коза", 70);
        bearEatPersentMap.put("Овца", 70);
        bearEatPersentMap.put("Кабан", 50);
        bearEatPersentMap.put("Буйвол", 20);
        bearEatPersentMap.put("Утка", 10);
        bearEatPersentMap.put("Гусеница", 0);
        bearEatPersentMap.put("Растения", 0);

        HashMap<String, HashMap<String, Integer>> animalsEatPersentMap = new HashMap<>();
        animalsEatPersentMap.put("Волк", wolfEatPersentMap);
        animalsEatPersentMap.put("Кролик", rabbitEatPersentMap);
        animalsEatPersentMap.put("Растения", plantEatPersentMap);
        animalsEatPersentMap.put("Удав", boaEatPersentMap);
        animalsEatPersentMap.put("Лиса", foxEatPersentMap);
        animalsEatPersentMap.put("Медведь", bearEatPersentMap);

        return animalsEatPersentMap;
    }

}
