package org.fasttrackit;

public class Animal {

    public Animal(Animal animal) {
    }

    String name;
    int age;
    int health;                             //Health level
    int hunger;                             //Hunger level
    int happiness;                          //Happiness level
    String favoriteFood;
    String favoriteRecreationalActivity;
    String type;
    String sex;


    public Animal(String name, int age, int health, int hunger, int happiness, String favoriteFood,
                  String favoriteRecreationalActivity, String type, String sex) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.hunger = hunger;
        this.happiness = happiness;
        this.favoriteFood = favoriteFood;
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
        this.type = type;
        this.sex = sex;
    }


}

