package com.zoo.species;

import com.zoo.animals.Animal;
import com.zoo.animals.Bird;
import com.zoo.interfaces.Playable;


public class Eagle extends Bird implements Animal.Eatable, Animal.Sleepable, Playable {
    public Eagle(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void play(){
        System.out.println(getName() + " грається ");
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
    private void buildNest(){
        System.out.println(getName() + " побудував гніздо ");
    };

    @Override
    public void uniqueBirdAction() {
        buildNest();

    }

}
