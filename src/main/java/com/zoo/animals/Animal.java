package com.zoo.animals;

public abstract class Animal {

    protected String name;
    private int energyLevel = 100;

    public Animal(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    public String getName(){
        return name;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }
    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }
    public abstract void eat();
    public abstract void sleep();

    public interface Eatable {
        void eat();
    }
    public interface Sleepable{
        void sleep();
    }

    public void getTired(){
        energyLevel -=25;
    }

    public abstract void makeSound(); {

    }

    public void displayInfo() {
        System.out.println(" Ім`я: " + name + ", Енергія: " + energyLevel ); // перевірити чи значення в дужках правильне

    }
}
