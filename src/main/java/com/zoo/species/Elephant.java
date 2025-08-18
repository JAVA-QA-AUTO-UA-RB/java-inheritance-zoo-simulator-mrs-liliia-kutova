package com.zoo.species;

import com.zoo.animals.Animal;
import com.zoo.animals.Mammal;
import com.zoo.interfaces.Playable;

public class Elephant extends Mammal implements Animal.Eatable, Animal.Sleepable, Playable {
    public Elephant(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void makeSound() {
        System.out.println("Труба-ба-ба! ");
    }

    @Override
    public void move() { System.out.println(getName() + " сильно тупотить");
    }

    @Override
    public void play(){
        System.out.println(getName() + " грається ");
    }

  public void spraySelf(){
      int currentEnergy =getEnergyLevel();
      currentEnergy -=15;
      setEnergyLevel(currentEnergy);
  }

    }



