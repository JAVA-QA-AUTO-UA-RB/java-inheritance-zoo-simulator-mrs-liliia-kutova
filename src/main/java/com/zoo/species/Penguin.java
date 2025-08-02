package com.zoo.species;

import com.zoo.animals.Bird;

public class Penguin extends Bird {
    public Penguin(String name, int age, int weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println("Кря-кря! ");
    }
    public void swim(){
        System.out.println(" Пінгвін не літає, але плаває" );
    }

    @Override
    public void fly(){
        swim();
    }
}