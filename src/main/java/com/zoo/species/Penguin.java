package com.zoo.species;

import com.zoo.animals.Animal;
import com.zoo.animals.Bird;
import com.zoo.interfaces.Playable;


public class Penguin extends Bird implements Animal.Eatable, Animal.Sleepable, Playable {
    public Penguin(String name, int energyLevel) {
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
        System.out.println("Кря-кря! ");
    }
    public void swim(){
        int currentEnergy =getEnergyLevel();
        currentEnergy -=20;
        setEnergyLevel(currentEnergy);
        System.out.println(" Пінгвін не літає, але плаває" );

    }

    @Override
    public void fly(){
        swim();
    }

    private void surfOnIce(){
        System.out.println(getName() + " проїхався по льоду ");
    }
    @Override
    public void uniqueBirdAction() {
        surfOnIce();
    }


    @Override
    public void play() {
        System.out.println(getName() + " грається ");
    }


}