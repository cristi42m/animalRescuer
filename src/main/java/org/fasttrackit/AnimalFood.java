package org.fasttrackit;

import java.time.LocalDateTime;

public class AnimalFood {


    private String name;
    private int price;
    private int quantity;
    private boolean availability_in_stock;
    LocalDateTime expiryDate;



    public AnimalFood(String name, int price, int quantity, boolean availability_in_stock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.availability_in_stock = availability_in_stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailability_in_stock() {
        return availability_in_stock;
    }

    public void setAvailability_in_stock(boolean availability_in_stock) {
        this.availability_in_stock = availability_in_stock;
    }


}

