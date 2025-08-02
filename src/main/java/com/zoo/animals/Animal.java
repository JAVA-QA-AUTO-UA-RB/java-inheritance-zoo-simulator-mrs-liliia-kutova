package com.zoo.animals;

public class Animal {

    protected String name;
    protected int age;
    protected int weight;
    private int energyLevel = 100;

    public Animal(String name, int age, int weight, int energyLevel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energyLevel = energyLevel;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }
    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public void eat() {
        energyLevel += 20;
    }

    public void sleep() {
        energyLevel += 20;
    }

    public void getTired(){
        energyLevel -=25;
    }

    public void makeSound() {
    }

    public void displayInfo() {
        System.out.println(" Ім`я: " + name + ", Вік: " + age + ", Вага: " + weight + ", Енергія: " + energyLevel ); // перевірити чи значення в дужках правильне

    }
}
