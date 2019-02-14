package org.fasttrackit;

public class Dog extends Animal {

    private String bark;


    public Dog(String name, int age, int health, int hunger, int happiness, String favoriteFood, String favoriteRecreationalActivity,
               String type, String sex, String bark) {
        super(name, age, health, hunger, happiness, favoriteFood, favoriteRecreationalActivity, type, sex);

        this.bark = bark;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
}





