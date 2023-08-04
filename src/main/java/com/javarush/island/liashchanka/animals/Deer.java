package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;

public class Deer extends Animal implements Herbivorous {

    public Deer() {
        super("Олень", 300);
    }


}