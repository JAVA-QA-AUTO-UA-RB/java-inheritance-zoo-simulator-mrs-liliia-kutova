package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant extends Mammal {
    public Elephant(String name, int age, int weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }
    @Override
    public void makeSound() {
        System.out.println("Труба-ба-ба! ");
    }
  public void spraySelf(){
      int currentEnergy =getEnergyLevel();
      currentEnergy -=15;
      setEnergyLevel(currentEnergy);
  }

    }



