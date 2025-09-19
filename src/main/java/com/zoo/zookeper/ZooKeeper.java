package com.zoo.zookeper;

import com.zoo.animals.Animal;

public class ZooKeeper {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal){
        animal.eat();
    }

    public void playWithAnimal(Animal animal){
        animal.makeSound();
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
