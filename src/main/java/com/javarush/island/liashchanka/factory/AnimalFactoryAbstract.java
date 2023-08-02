package com.javarush.island.liashchanka.factory;

import com.javarush.island.liashchanka.abstracts.Animal;

public abstract class AnimalFactoryAbstract extends Animal{

    public AnimalFactoryAbstract(String name, double weight) {
        super(name, weight);
    }
    public AnimalFactoryAbstract() {
        super("Фабрика", 0);

    }


    public abstract Animal createAnimal(String animalTypes);


}

