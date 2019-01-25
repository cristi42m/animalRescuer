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
