package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Predatory;

public class Boa extends Animal implements Predatory {

    public Boa() {
        super("Удав", 15);
    }


}
