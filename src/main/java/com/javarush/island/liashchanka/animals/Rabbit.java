package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;

public class Rabbit extends Animal implements Herbivorous {

    public Rabbit() {
        super("Кролик", 2, 0.45);



    }
}
