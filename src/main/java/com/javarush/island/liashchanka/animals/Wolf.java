package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;

public class Wolf extends Animal implements Herbivorous {
    public Wolf() {


        super("Волк", 3, 50);

    }


}
