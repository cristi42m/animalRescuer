package org.fasttrackit;

import java.time.LocalDateTime;

public class AnimalFood {


    String name;
    int price;
    int quantity;
    boolean availability_in_stock;
    LocalDateTime expiryDate;


    public AnimalFood(String name, int price, int quantity, boolean availability_in_stock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.availability_in_stock = availability_in_stock;
    }
}

