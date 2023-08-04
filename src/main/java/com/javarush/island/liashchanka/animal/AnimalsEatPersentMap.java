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

        HashMap<String, Integer> eagleEatPersentMap = new HashMap<>();
        eagleEatPersentMap.put("Волк", 0); //0
        eagleEatPersentMap.put("Удав", 0);
        eagleEatPersentMap.put("Лиса", 10);
        eagleEatPersentMap.put("Медведь", 0);
        eagleEatPersentMap.put("Орел", 0);
        eagleEatPersentMap.put("Лошадь", 0);
        eagleEatPersentMap.put("Олень", 0);
        eagleEatPersentMap.put("Кролик", 90);
        eagleEatPersentMap.put("Мышь", 90);
        eagleEatPersentMap.put("Коза", 0);
        eagleEatPersentMap.put("Овца", 0);
        eagleEatPersentMap.put("Кабан", 0);
        eagleEatPersentMap.put("Буйвол", 0);
        eagleEatPersentMap.put("Утка", 80);
        eagleEatPersentMap.put("Гусеница", 0);
        eagleEatPersentMap.put("Растения", 0);

        HashMap<String, Integer> horseEatPersentMap = new HashMap<>();
        horseEatPersentMap.put("Волк", 0); //0
        horseEatPersentMap.put("Удав", 0);
        horseEatPersentMap.put("Лиса", 0);
        horseEatPersentMap.put("Медведь", 0);
        horseEatPersentMap.put("Орел", 0);
        horseEatPersentMap.put("Лошадь", 0);
        horseEatPersentMap.put("Олень", 0);
        horseEatPersentMap.put("Кролик", 0);
        horseEatPersentMap.put("Мышь", 0);
        horseEatPersentMap.put("Коза", 0);
        horseEatPersentMap.put("Овца", 0);
        horseEatPersentMap.put("Кабан", 0);
        horseEatPersentMap.put("Буйвол", 0);
        horseEatPersentMap.put("Утка", 0);
        horseEatPersentMap.put("Гусеница", 0);
        horseEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> deerEatPersentMap = new HashMap<>();
        deerEatPersentMap.put("Волк", 0); //0
        deerEatPersentMap.put("Удав", 0);
        deerEatPersentMap.put("Лиса", 0);
        deerEatPersentMap.put("Медведь", 0);
        deerEatPersentMap.put("Орел", 0);
        deerEatPersentMap.put("Лошадь", 0);
        deerEatPersentMap.put("Олень", 0);
        deerEatPersentMap.put("Кролик", 0);
        deerEatPersentMap.put("Мышь", 0);
        deerEatPersentMap.put("Коза", 0);
        deerEatPersentMap.put("Овца", 0);
        deerEatPersentMap.put("Кабан", 0);
        deerEatPersentMap.put("Буйвол", 0);
        deerEatPersentMap.put("Утка", 0);
        deerEatPersentMap.put("Гусеница", 0);
        deerEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> mouseEatPersentMap = new HashMap<>();
        mouseEatPersentMap.put("Волк", 0);
        mouseEatPersentMap.put("Удав", 0);
        mouseEatPersentMap.put("Лиса", 0);
        mouseEatPersentMap.put("Медведь", 0);
        mouseEatPersentMap.put("Орел", 0);
        mouseEatPersentMap.put("Лошадь", 0);
        mouseEatPersentMap.put("Олень", 0);
        mouseEatPersentMap.put("Кролик", 0);
        mouseEatPersentMap.put("Мышь", 0);
        mouseEatPersentMap.put("Коза", 0);
        mouseEatPersentMap.put("Овца", 0);
        mouseEatPersentMap.put("Кабан", 0);
        mouseEatPersentMap.put("Буйвол", 0);
        mouseEatPersentMap.put("Утка", 0);
        mouseEatPersentMap.put("Гусеница", 90);
        mouseEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> goatEatPersentMap = new HashMap<>();
        goatEatPersentMap.put("Волк", 0);
        goatEatPersentMap.put("Удав", 0);
        goatEatPersentMap.put("Лиса", 0);
        goatEatPersentMap.put("Медведь", 0);
        goatEatPersentMap.put("Орел", 0);
        goatEatPersentMap.put("Лошадь", 0);
        goatEatPersentMap.put("Олень", 0);
        goatEatPersentMap.put("Кролик", 0);
        goatEatPersentMap.put("Мышь", 0);
        goatEatPersentMap.put("Коза", 0);
        goatEatPersentMap.put("Овца", 0);
        goatEatPersentMap.put("Кабан", 0);
        goatEatPersentMap.put("Буйвол", 0);
        goatEatPersentMap.put("Утка", 0);
        goatEatPersentMap.put("Гусеница", 0);
        goatEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> sheepEatPersentMap = new HashMap<>();
        sheepEatPersentMap.put("Волк", 0);
        sheepEatPersentMap.put("Удав", 0);
        sheepEatPersentMap.put("Лиса", 0);
        sheepEatPersentMap.put("Медведь", 0);
        sheepEatPersentMap.put("Орел", 0);
        sheepEatPersentMap.put("Лошадь", 0);
        sheepEatPersentMap.put("Олень", 0);
        sheepEatPersentMap.put("Кролик", 0);
        sheepEatPersentMap.put("Мышь", 0);
        sheepEatPersentMap.put("Коза", 0);
        sheepEatPersentMap.put("Овца", 0);
        sheepEatPersentMap.put("Кабан", 0);
        sheepEatPersentMap.put("Буйвол", 0);
        sheepEatPersentMap.put("Утка", 0);
        sheepEatPersentMap.put("Гусеница", 0);
        sheepEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> boarEatPersentMap = new HashMap<>();
        boarEatPersentMap.put("Волк", 0);
        boarEatPersentMap.put("Удав", 0);
        boarEatPersentMap.put("Лиса", 0);
        boarEatPersentMap.put("Медведь", 0);
        boarEatPersentMap.put("Орел", 0);
        boarEatPersentMap.put("Лошадь", 0);
        boarEatPersentMap.put("Олень", 0);
        boarEatPersentMap.put("Кролик", 0);
        boarEatPersentMap.put("Мышь", 0);
        boarEatPersentMap.put("Коза", 0);
        boarEatPersentMap.put("Овца", 0);
        boarEatPersentMap.put("Кабан", 0);
        boarEatPersentMap.put("Буйвол", 0);
        boarEatPersentMap.put("Утка", 0);
        boarEatPersentMap.put("Гусеница", 0);
        boarEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> buffaloEatPersentMap = new HashMap<>();
        buffaloEatPersentMap.put("Волк", 0);
        buffaloEatPersentMap.put("Удав", 0);
        buffaloEatPersentMap.put("Лиса", 0);
        buffaloEatPersentMap.put("Медведь", 0);
        buffaloEatPersentMap.put("Орел", 0);
        buffaloEatPersentMap.put("Лошадь", 0);
        buffaloEatPersentMap.put("Олень", 0);
        buffaloEatPersentMap.put("Кролик", 0);
        buffaloEatPersentMap.put("Мышь", 0);
        buffaloEatPersentMap.put("Коза", 0);
        buffaloEatPersentMap.put("Овца", 0);
        buffaloEatPersentMap.put("Кабан", 0);
        buffaloEatPersentMap.put("Буйвол", 0);
        buffaloEatPersentMap.put("Утка", 0);
        buffaloEatPersentMap.put("Гусеница", 0);
        buffaloEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> duckEatPersentMap = new HashMap<>();
        duckEatPersentMap.put("Волк", 0);
        duckEatPersentMap.put("Удав", 0);
        duckEatPersentMap.put("Лиса", 0);
        duckEatPersentMap.put("Медведь", 0);
        duckEatPersentMap.put("Орел", 0);
        duckEatPersentMap.put("Лошадь", 0);
        duckEatPersentMap.put("Олень", 0);
        duckEatPersentMap.put("Кролик", 0);
        duckEatPersentMap.put("Мышь", 0);
        duckEatPersentMap.put("Коза", 0);
        duckEatPersentMap.put("Овца", 0);
        duckEatPersentMap.put("Кабан", 0);
        duckEatPersentMap.put("Буйвол", 0);
        duckEatPersentMap.put("Утка", 0);
        duckEatPersentMap.put("Гусеница", 90);
        duckEatPersentMap.put("Растения", 100);

        HashMap<String, Integer> caterpillarEatPersentMap = new HashMap<>();
        caterpillarEatPersentMap.put("Волк", 0);
        caterpillarEatPersentMap.put("Удав", 0);
        caterpillarEatPersentMap.put("Лиса", 0);
        caterpillarEatPersentMap.put("Медведь", 0);
        caterpillarEatPersentMap.put("Орел", 0);
        caterpillarEatPersentMap.put("Лошадь", 0);
        caterpillarEatPersentMap.put("Олень", 0);
        caterpillarEatPersentMap.put("Кролик", 0);
        caterpillarEatPersentMap.put("Мышь", 0);
        caterpillarEatPersentMap.put("Коза", 0);
        caterpillarEatPersentMap.put("Овца", 0);
        caterpillarEatPersentMap.put("Кабан", 0);
        caterpillarEatPersentMap.put("Буйвол", 0);
        caterpillarEatPersentMap.put("Утка", 0);
        caterpillarEatPersentMap.put("Гусеница", 0);
        caterpillarEatPersentMap.put("Растения", 100);

        HashMap<String, HashMap<String, Integer>> animalsEatPersentMap = new HashMap<>();
        animalsEatPersentMap.put("Волк", wolfEatPersentMap);
        animalsEatPersentMap.put("Кролик", rabbitEatPersentMap);
        animalsEatPersentMap.put("Растения", plantEatPersentMap);
        animalsEatPersentMap.put("Удав", boaEatPersentMap);
        animalsEatPersentMap.put("Лиса", foxEatPersentMap);
        animalsEatPersentMap.put("Медведь", bearEatPersentMap);
        animalsEatPersentMap.put("Орел", eagleEatPersentMap);
        animalsEatPersentMap.put("Лошадь", horseEatPersentMap);
        animalsEatPersentMap.put("Олень", deerEatPersentMap);
        animalsEatPersentMap.put("Мышь", mouseEatPersentMap);
        animalsEatPersentMap.put("Коза", goatEatPersentMap);
        animalsEatPersentMap.put("Овца", sheepEatPersentMap);
        animalsEatPersentMap.put("Кабан", boarEatPersentMap);
        animalsEatPersentMap.put("Буйвол", buffaloEatPersentMap);
        animalsEatPersentMap.put("Утка", duckEatPersentMap);
        animalsEatPersentMap.put("Гусеница", caterpillarEatPersentMap);

        return animalsEatPersentMap;
    }

}
