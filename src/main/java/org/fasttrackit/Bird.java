package org.fasttrackit;

public class Bird extends Animal{

   private boolean fly;




    public Bird(String name, int age, int health, int hunger, int happiness, String favoriteFood, String favoriteRecreationalActivity, String type, String sex) {
        super(name, age, health, hunger, happiness, favoriteFood, favoriteRecreationalActivity, type, sex);
        this.fly = fly;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }
}