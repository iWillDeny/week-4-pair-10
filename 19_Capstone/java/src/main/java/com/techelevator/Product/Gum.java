package com.techelevator.Product;

public class Gum extends Product{



    public Gum() {

        category = Product.getCategory();
        slotID = Product.getSlotId();
        price = Product.getPrice();
        name = Product.getName();

    }
}
