package com.javarush.island.liashchanka.functions;

import com.javarush.island.liashchanka.abstracts.Animal;
import com.javarush.island.liashchanka.animal.Position;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;

import static com.javarush.island.liashchanka.functions.DeleteAnimalFromIsland.deleteAnimalFromIsland;
import static com.javarush.island.liashchanka.functions.IslandRecalculation.makeIslandRecalculation;

public class EatAnimal {


    // �������� ���� �������� �������
    public static void makeEatAnimal(List<Animal> animalsList, Map<Position, List<Animal>> island) {
        for (var positionAndAnimal : island.entrySet()) {
            for (var animal : positionAndAnimal.getValue()) {

                SecureRandom randomAnimal = new SecureRandom();
                int positionRandom = positionAndAnimal.getValue().size();
                int randomAnimalToEat = randomAnimal.nextInt(positionRandom); //��������� �������� �� ����� � ����� �������

                Animal meEatAnimal = positionAndAnimal.getValue().get(randomAnimalToEat);
                if (meEatAnimal.isLive()) {  // ���� �������� ����� ������� ������
                    Animal.eat(animal, meEatAnimal);
                }
            }
        }

        // �������� �� ������ ��������� ��� ���������� ���� ��������
        deleteAnimalFromIsland(animalsList);

        // ������������� ������ ����� �������� ��� ����������� ��������
        makeIslandRecalculation(animalsList, island);

    }

}
