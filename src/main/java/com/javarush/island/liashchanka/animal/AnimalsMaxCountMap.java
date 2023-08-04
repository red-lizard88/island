package com.javarush.island.liashchanka.animal;

import java.util.HashMap;

public class AnimalsMaxCountMap {


    public static HashMap<String, Integer> animalsMaxCountMap() {

        // Максимальное количество животных на одной клетке
        HashMap<String, Integer> animalsMaxCountMap = new HashMap<>();
        animalsMaxCountMap.put("Волк", 30); //30
        animalsMaxCountMap.put("Кролик", 150); //150
        animalsMaxCountMap.put("Растения", 200); //200
        animalsMaxCountMap.put("Удав", 30); //30
        animalsMaxCountMap.put("Лиса", 30); //30
//        animalsMaxCountMap.put("Медведь", 5); //5
//        animalsMaxCountMap.put("Орел", 20); //20
//        animalsMaxCountMap.put("Лошадь", 20); //20
//        animalsMaxCountMap.put("Олень", 20); //20
//        animalsMaxCountMap.put("Мышь", 500); //500
//        animalsMaxCountMap.put("Коза", 140); //140
//        animalsMaxCountMap.put("Овца", 140);
//        animalsMaxCountMap.put("Кабан", 50);
//        animalsMaxCountMap.put("Буйвол", 10);
//        animalsMaxCountMap.put("Утка", 200);
//        animalsMaxCountMap.put("Гусеница", 1000);


        return animalsMaxCountMap;
    }

}
