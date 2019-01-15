package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Tequila";
        animal.age = 1;
        animal.health = 10;
        animal.hunger = 7;
        animal.happiness = 9;
        animal.favoriteFood = "mice";
        animal.favoriteRecreationalActivity = "play with the ball";
        animal.type = "cat";
        animal.sex = "male";


        Adopter adopter = new Adopter();
        adopter.name = "Ana";
        adopter.money_available = 100;


        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Purina";
        animalFood.price = 20;
        animalFood.quantity = 10;
        System.out.println("numele animalului este:" + animal.name);



    }

}
