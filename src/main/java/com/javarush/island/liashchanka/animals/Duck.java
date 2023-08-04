package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;

public class Duck extends Animal implements Herbivorous {

    public Duck() {
        super("Утка", 1);
    }


}