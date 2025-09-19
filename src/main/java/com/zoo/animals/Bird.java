package com.zoo.animals;

public class Bird extends Animal {
    protected String wingSpan;

    public Bird(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "makes a sound! ");
    }

    public void fly(){
        decreaseEnergyLevel(15);
        System.out.println(getName() + "летить");
    }


    }

