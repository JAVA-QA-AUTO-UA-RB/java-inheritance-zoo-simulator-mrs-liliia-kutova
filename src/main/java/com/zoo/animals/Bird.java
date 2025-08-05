package com.zoo.animals;

abstract class Bird extends Animal {
    protected String wingSpan;

    public Bird(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "makes a sound! ");
    }

    public void fly(){
        int currentEnergy = getEnergyLevel();
        currentEnergy -=15;
        setEnergyLevel(currentEnergy);
    }
    public abstract void uniqueBirdAction();

    }

