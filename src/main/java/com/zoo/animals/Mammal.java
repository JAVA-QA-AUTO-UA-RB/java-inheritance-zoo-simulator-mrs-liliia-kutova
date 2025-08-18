package com.zoo.animals;

public abstract class Mammal extends Animal {
    protected String furColor;


    public Mammal(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
     System.out.println(name + " makes a sound! ");
    }

    public void groom(){}

    public abstract void move();
}


