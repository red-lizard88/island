package com.javarush.island.liashchanka.animals;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;



    public class Caterpillar extends Animal implements Herbivorous {

        public Caterpillar() {
            super("Гусеница", 0.01);
        }


    }

