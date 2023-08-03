package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;
import com.javarush.island.liashchanka.factory.AnimalFactory;
import com.javarush.island.liashchanka.factory.AnimalFactoryAbstract;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.animal.AnimalsMaxCountMap.animalsMaxCountMap;
import static com.javarush.island.liashchanka.functions.IslandRecalculation.makeIslandRecalculation;

public class BornAnimal {

    // ����������� �������� � ������ ������������� ���������� �� ������
    public static void makeBornAnimal(List<Animal> animalsList, Map<Position, List<Animal>> island){

        for (var positionAndAnimal : island.entrySet()) {
            int countOfAnimal = 0;
            AnimalFactoryAbstract creator = new AnimalFactory();
            Map<String, List<Animal>> islandGrupByNameinPosition = new HashMap<>();

            for (var animalName : animalsMaxCountMap().entrySet()) { // ���� ��� �������� � ������������ ��� ����������
                List<Animal> animalsListTemp = new ArrayList<>();
                for (var animal : positionAndAnimal.getValue()) {
                    if (animal.getName().equals(animalName.getKey())) {
                        animalsListTemp.add(animal);
                        countOfAnimal = animalName.getValue();
                    }
                }
                islandGrupByNameinPosition.put(animalName.getKey(), animalsListTemp); // ������������� map � ����� �������� ������ ���� ��������
            }

            for (var animalName : islandGrupByNameinPosition.entrySet()) {
                SecureRandom randomAnimal = new SecureRandom();
                if((countOfAnimal - animalName.getValue().size())>0 && (countOfAnimal - animalName.getValue().size())!=1) {
                    int randomAnimalToBorn = randomAnimal.nextInt((countOfAnimal - animalName.getValue().size())); // ��������� ���������� �������� ��������, �� �� ����� ��������
                    for (int m = 0; m < randomAnimalToBorn; m++) {
                        Animal animal = creator.createAnimal(animalName.getKey()); // ������� � ������� ��������� ���������� ���������� �������� ��������

                        animal.setPosition(positionAndAnimal.getKey());
                        animal.setId(animalName.getKey() + "-new-" + m + "-random-" + randomAnimalToBorn); // ��������� ���������� id ���������
                        animalsList.add(animal); // ��������� � ���� ��������
                    }
                }

            }
        }

        // ������������� ������ ����� �������� ��� ����������� ��������
        makeIslandRecalculation(animalsList, island);


    }

}
