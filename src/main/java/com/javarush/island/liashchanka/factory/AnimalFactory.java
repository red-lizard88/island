package com.javarush.island.liashchanka.factory;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animals.Plant;
import com.javarush.island.liashchanka.animals.Rabbit;
import com.javarush.island.liashchanka.animals.Wolf;

public class AnimalFactory extends AnimalFactoryAbstract {


    public AnimalFactory(String name, int maxStep, double weight) {
        super(name, weight);
    }

    public AnimalFactory() {
        super("Фабрика",  0);

    }

    @Override
    public Animal createAnimal(String animalTypes) {
        Animal animal = switch (animalTypes) {
            case "Волк" -> new Wolf();
            case "Кролик" -> new Rabbit();
            case "Растения" -> new Plant();
            default -> null;
        };

        return animal;
    }


}
