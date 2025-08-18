package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;
import com.zoo.species.Penguin;
import com.zoo.zookeper.ZooKeeper;

import java.util.ArrayList;
import java.util.List;

public class ZooSimulator {

    public static void main(String[] args) {

        Lion lion = new Lion("Лев", 70);
        Elephant elephant = new Elephant("Слон", 70);
        Eagle eagle = new Eagle("Юний орел", 60);
        Penguin penguin = new Penguin("Пінгвін", 65);


        // Виведіть фінальні результати та стани тварин наприкінці дня.

        List<Animal> animals = new ArrayList<>();

        animals.add(lion);
        animals.add(elephant);
        animals.add(eagle);
        animals.add(penguin);

        for (Animal animal: animals){
            animal.makeSound();
            animal.sleep();
        }

    List <Animal.Eatable> eatableAnimals = new ArrayList<>();
        eatableAnimals.add(lion);
        eatableAnimals.add(elephant);
        eatableAnimals.add(eagle);
        eatableAnimals.add(penguin);

        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.setName("Олег ");

        for (Animal.Eatable eatable: eatableAnimals){
            zooKeeper.feedAnimal(eatable);

        }



        zooKeeper.playWithAnimal(lion);
        lion.getTired();
        zooKeeper.checkAnimalEnergyLevel(lion);
        lion.sleep();
        lion.hunt();
        zooKeeper.checkAnimalEnergyLevel(lion);

        zooKeeper.playWithAnimal(elephant);
        elephant.spraySelf();
        elephant.getTired();
        zooKeeper.checkAnimalEnergyLevel(elephant);
        elephant.sleep();
        zooKeeper.checkAnimalEnergyLevel(elephant);

        zooKeeper.playWithAnimal(eagle);
        zooKeeper.checkAnimalEnergyLevel(eagle);
        eagle.fly();
        eagle.getTired();
        eagle.sleep();
        zooKeeper.checkAnimalEnergyLevel(eagle);

        zooKeeper.playWithAnimal(penguin);
        zooKeeper.checkAnimalEnergyLevel(penguin);
        penguin.fly();
        penguin.getTired();
        penguin.sleep();
        zooKeeper.checkAnimalEnergyLevel(penguin);

        lion.displayInfo();
        elephant.displayInfo();
        eagle.displayInfo();
        penguin.displayInfo();


    }
}
