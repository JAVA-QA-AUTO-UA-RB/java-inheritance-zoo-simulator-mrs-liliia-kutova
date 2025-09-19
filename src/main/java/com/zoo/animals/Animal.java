package com.zoo.animals;

public class Animal {

    protected String name;
    protected int age;
    protected int weight;
    private int energyLevel = 100;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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
        if (energyLevel <0 || energyLevel >100){
            throw new IllegalArgumentException("Energy level must be between 0 and 100");
        }
        this.energyLevel = energyLevel;
    }
    private void increaseEnergyLevel(int i) {
    }
    public void eat() {
       increaseEnergyLevel(10);
    }


    public void sleep() {
        increaseEnergyLevel(10);
    }
    public void decreaseEnergyLevel(int i){

    }
    public void getTired(){
        decreaseEnergyLevel(25);
    }

    public void makeSound() {
        decreaseEnergyLevel(15);
        System.out.println("Тваринка подає звук");
    }

    public void displayInfo() {
        System.out.println(" Ім`я: " + name + ", Вік: " + age + ", Вага: " + weight + ", Енергія: " + energyLevel ); // перевірити чи значення в дужках правильне

    }
}
