package org.fasttrackit;

import java.time.LocalDateTime;

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
        animal.favoriteRecreationalActivity = "ball playing";
        animal.type = "cat";
        animal.sex = "male";


        Adopter adopter = new Adopter();
        adopter.name = "Maria";
        adopter.money_available = 100;


        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Purina cat food";
        animalFood.price = 20;
        animalFood.quantity = 10;
        animalFood.availability_in_stock = true;
        animalFood.expiryDate = LocalDateTime.of(2019, 3, 17, 12, 30);




        RecreationalActivity recreationalActivity1 = new RecreationalActivity();
        recreationalActivity1.name = "ball playing";
        RecreationalActivity recreationalActivity2 = new RecreationalActivity();
        recreationalActivity2.name = "playing with a laser";
        RecreationalActivity recreationalActivity3 = new RecreationalActivity();
        recreationalActivity3.name = "walking the pet";


        Veterinarian veterinarian1 = new Veterinarian();
        veterinarian1.name  = "John";
        veterinarian1.specialization = "cat specialist";



        System.out.println("Animal name is " + animal.name + ", it is a " + animal.sex +" "+ animal.type +  "!");

        System.out.println(animal.name + " status: health level: " + animal.health + ", hunger level: " + animal.hunger +
             ", happiness level: " + animal.happiness + ", favourite food: " + animal.favoriteFood + "!");

        System.out.println(animal.name + " is " + animal.age + " year old, and his favourite activity is "
             + animal.favoriteRecreationalActivity + "!");

        System.out.println("Expiry date of Purina cat food is " + animalFood.expiryDate);


    }

}
