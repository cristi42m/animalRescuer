package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Animal animal = new Animal("Tequila",1,10,7,9,"mice","ball playing","cat","male");




        Adopter adopter = new Adopter();
        adopter.name = "Maria";
        adopter.money_available = 100;



        AnimalFood animalFood = new AnimalFood("Purina cat food",20,10,true);
        animalFood.expiryDate = LocalDateTime.of(2019, 3, 17, 12, 30);



        RecreationalActivity recreationalActivity1 = new RecreationalActivity("ball playing");
        RecreationalActivity recreationalActivity2 = new RecreationalActivity("playing with a laser");
        RecreationalActivity recreationalActivity3 = new RecreationalActivity("walking the pet");



        Veterinarian veterinarian1 = new Veterinarian("John","Cat specialist");
        Veterinarian veterinarian2 = new Veterinarian("Samantha","Dog specialist");


        System.out.println("Animal name is " + animal.name + ", it is a " + animal.sex +" "+ animal.type +  "!");

        System.out.println(animal.name + " status: health level: " + animal.health + ", hunger level: " + animal.hunger +
             ", happiness level: " + animal.happiness + ", favourite food: " + animal.favoriteFood + "!");

        System.out.println(animal.name + " is " + animal.age + " year old, and his favourite activity is "
             + animal.favoriteRecreationalActivity + "!");

        System.out.println("Expiry date of Purina cat food is " + animalFood.expiryDate);


    }

}
