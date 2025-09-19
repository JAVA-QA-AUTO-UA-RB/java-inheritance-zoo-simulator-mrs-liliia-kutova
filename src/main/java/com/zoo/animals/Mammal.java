package com.zoo.animals;

public class Mammal extends Animal {
    protected String furColor;


    public Mammal(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
     System.out.println(name + " makes a sound! ");
    }

    public void groom(){
        System.out.println("Птахи мають пір`я, а ссавці мають шерсть");

    }
}


