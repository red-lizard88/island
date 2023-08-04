package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;
import com.javarush.island.liashchanka.abstracts.Predatory;

public class Horse extends Animal implements Herbivorous {

    public Horse() {
        super("Лошадь", 400);
    }


}