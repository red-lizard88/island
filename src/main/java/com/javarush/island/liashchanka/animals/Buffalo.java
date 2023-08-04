package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;

public class Buffalo extends Animal implements Herbivorous {

    public Buffalo() {
        super("Буйвол", 700);
    }


}