package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion extends Mammal {
    public Lion(String name, int age, int weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println("Ppppp! ");
    }

public void hunt(){
    int currentEnergy =getEnergyLevel();
    currentEnergy -=25;
    setEnergyLevel(currentEnergy);
}


    }

