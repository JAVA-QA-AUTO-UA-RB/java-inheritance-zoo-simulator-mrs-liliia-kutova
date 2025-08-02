package com.zoo.species;

import com.zoo.animals.Bird;

public class Eagle extends Bird {
    public Eagle(String name, int age, int weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println("Кріі-кріі! ");
    }
    @Override
    public void fly(){
        int currentEnergy =getEnergyLevel();
        currentEnergy -=20;
        setEnergyLevel(currentEnergy);
    }

}
