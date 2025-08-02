package com.zoo.animals;

public class Bird extends Animal {
    protected String wingSpan;

    public Bird(String name, int age, int weight, int energyLevel) {
        super(name, age, weight, energyLevel);
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

    protected void setEnergyLevel(int currentEnergy) {

    }
}
