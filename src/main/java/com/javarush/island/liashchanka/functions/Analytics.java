package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.abstracts.Herbivorous;
import com.javarush.island.liashchanka.abstracts.Predatory;
import com.javarush.island.liashchanka.animal.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Analytics {



    public static int countPredatory;
    public static int countHerbivorous;

    public static void makeAnalytics(List<Animal> animalsList, Map<Position, List<Animal>> island){

         countPredatory = 0;
         countHerbivorous=0;
        for(var animal: animalsList){
            Class<? extends Animal> personClass = animal.getClass();
            final Class<?>[] interfaces = personClass.getInterfaces();

            for (int i = 0; i < interfaces.length; i++) {
                if(interfaces[i].equals(Herbivorous.class)){
                    countHerbivorous++;
                }else if (interfaces[i].equals(Predatory.class)){
                    countPredatory++;
                }
            }

        }
        System.out.println("Hichniki:"+countPredatory+", Travoiadnie:"+countHerbivorous);

    }

}
