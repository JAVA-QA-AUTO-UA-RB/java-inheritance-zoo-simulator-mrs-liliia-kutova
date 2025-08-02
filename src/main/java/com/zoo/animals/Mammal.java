package com.zoo.animals;

public class Mammal extends Animal {
    protected String furColor;


    public Mammal(String name, int age, int weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }

    @Override
    public void makeSound() {
     System.out.println(name + " makes a sound! ");
    }

    public void groom(){

    }
}


