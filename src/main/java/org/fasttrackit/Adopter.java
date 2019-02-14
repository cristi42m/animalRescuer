package org.fasttrackit;

public class Adopter {

   private String name;
   private String sex;
   private int money_available;



    public Adopter(String name, String sex, int money_available) {
        this.name = name;
        this.sex = sex;
        this.money_available = money_available;
    }




    public void  feeding (Animal animal, AnimalFood animalFood){


        System.out.println(this.getName() + " just gave some " + animalFood.getName() + " to " + animal.getName() +"!");
    }


    public void playing ( Animal animal, RecreationalActivity recreationalActivity3){
        System.out.println( this.getName() +  " took " +  animal.getName() + " for a " + recreationalActivity3.getName() + " !");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getMoney_available() {
        return money_available;
    }

    public void setMoney_available(int money_available) {
        this.money_available = money_available;
    }



}
