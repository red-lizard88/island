package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Predatory;

public class Eagle extends Animal implements Predatory {

    public Eagle() {
        super("Орел", 6);
    }


}
