package com.zoo.zookeper;

import com.zoo.animals.Animal;
import com.zoo.interfaces.Playable;

public class ZooKeeper {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal.Eatable animal){
        animal.eat();
    }

    public void playWithAnimal(Playable animal){
        animal.play();
    }

    public void checkAnimalEnergyLevel(Animal animal){
        int energy = animal.getEnergyLevel();
        if (energy <=30){
            System.out.println("Рівень енергії: низький ");
        } else if (energy <=70){
            System.out.println("Рівень енергії: середній ");
        } else {
            System.out.println("Рівень енергії: високий ");
        }

    }
}
