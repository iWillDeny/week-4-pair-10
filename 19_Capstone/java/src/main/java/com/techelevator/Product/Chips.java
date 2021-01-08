package com.techelevator.Product;

public class Chips extends Product{



    public Chips() {

        category = Product.getCategory();
        slotID = Product.getSlotId();
        price = Product.getPrice();
        name = Product.getName();

    }
}
