package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Predatory;

public class Bear extends Animal implements Predatory {

    public Bear() {
        super("Медведь", 500);
    }


}