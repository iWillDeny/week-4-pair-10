package com.techelevator.Product;

public class Candy extends Product{



    public Candy() {

        category = Product.getCategory();
        slotID = Product.getSlotId();
        price = Product.getPrice();
        name = Product.getName();

    }
}