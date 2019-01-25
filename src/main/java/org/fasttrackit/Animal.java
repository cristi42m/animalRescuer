package org.fasttrackit;

public class Animal {


    private String name;
    private int age;
    private int health;                             //Health level
    private int hunger;                             //Hunger level
    private int happiness;                          //Happiness level
    private String favoriteFood;
    private String favoriteRecreationalActivity;
    private String type;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteRecreationalActivity() {
        return favoriteRecreationalActivity;
    }

    public void setFavoriteRecreationalActivity(String favoriteRecreationalActivity) {
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



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

