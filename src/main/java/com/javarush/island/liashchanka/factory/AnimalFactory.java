package com.javarush.island.liashchanka.factory;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animals.*;

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
            case "Удав" -> new Boa();
            case "Лиса" -> new Fox();
            case "Медведь" -> new Bear();
            case "Орел" -> new Eagle();
            case "Лошадь" -> new Horse();
            case "Олень" -> new Deer();
            case "Мышь" -> new Mouse();
            case "Коза" -> new Goat();
            case "Овца" -> new Sheep();
            case "Кабан" -> new Boar();
            case "Буйвол" -> new Buffalo();
            case "Утка" -> new Duck();
            case "Гусеница" -> new Caterpillar();
            default -> null;
        };

        return animal;
    }


}
