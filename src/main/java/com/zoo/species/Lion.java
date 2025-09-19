package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion extends Mammal {
    public Lion(String name, int age, int weight, int energyLevel) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Ppppp! ");
    }

public void hunt(){
    decreaseEnergyLevel(25);
    System.out.println(getName() + " полює ");
}
}

