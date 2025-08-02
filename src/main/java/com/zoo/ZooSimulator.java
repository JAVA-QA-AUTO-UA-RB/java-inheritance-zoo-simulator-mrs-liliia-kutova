package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.animals.Bird;
import com.zoo.animals.Mammal;
import com.zoo.species.Eagle;
import com.zoo.species.Elephant;
import com.zoo.species.Lion;
import com.zoo.species.Penguin;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {


        // Виведіть фінальні результати та стани тварин наприкінці дня.


        Lion lion = new Lion("Лев",2,150,70);
        Elephant elephant = new Elephant("Слон", 5, 5500,70);
        Eagle eagle = new Eagle("Юний орел", 1,5,60);
        Penguin penguin = new Penguin("Пінгвін",1, 10,65);


        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.setName("Олег ");


        zooKeeper.feedAnimal(lion);
        zooKeeper.playWithAnimal(lion);
        lion.getTired();
        zooKeeper.playWithAnimal(lion);
        zooKeeper.checkAnimalEnergyLevel(lion);
        lion.sleep();
        lion.hunt();
        zooKeeper.checkAnimalEnergyLevel(lion);

        zooKeeper.feedAnimal(elephant);
        zooKeeper.playWithAnimal(elephant);
        elephant.spraySelf();
        elephant.getTired();
        zooKeeper.checkAnimalEnergyLevel(elephant);
        elephant.sleep();
        zooKeeper.checkAnimalEnergyLevel(elephant);

        zooKeeper.feedAnimal(eagle);
        zooKeeper.playWithAnimal(eagle);
        zooKeeper.checkAnimalEnergyLevel(eagle);
        eagle.fly();
        eagle.getTired();
        eagle.sleep();
        zooKeeper.checkAnimalEnergyLevel(eagle);

        zooKeeper.feedAnimal(penguin);
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
