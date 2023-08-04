package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;

public class Sheep extends Animal implements Herbivorous {

    public Sheep() {
        super("Овца", 70);
    }


}