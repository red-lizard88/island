package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;

public class Goat extends Animal implements Herbivorous {

    public Goat() {
        super("Коза", 60);
    }


}