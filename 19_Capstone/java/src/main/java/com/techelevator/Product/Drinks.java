package com.techelevator.Product;

public class Drinks extends Product{



    public Drinks() {

        category = Product.getCategory();
        slotID = Product.getSlotId();
        price = Product.getPrice();
        name = Product.getName();

    }
}
