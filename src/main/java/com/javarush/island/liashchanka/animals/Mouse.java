package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;

public class Mouse extends Animal implements Herbivorous {

    public Mouse() {
        super("Мышь", 0.05);
    }


}