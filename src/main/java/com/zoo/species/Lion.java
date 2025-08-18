package com.zoo.species;

import com.zoo.animals.Animal;
import com.zoo.animals.Mammal;
import com.zoo.interfaces.Playable;

public class Lion extends Mammal implements Animal.Eatable, Animal.Sleepable, Playable {
    public Lion(String name, int energyLevel) {
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
        System.out.println("Ppppp! ");
    }

    @Override
    public void move() {System.out.println(getName() + " швидко біжить ");

    }

    public void hunt(){
    int currentEnergy =getEnergyLevel();
    currentEnergy -=25;
    setEnergyLevel(currentEnergy);
}


    @Override
    public void play() {
        System.out.println(getName() + " грається ");
    }
}

