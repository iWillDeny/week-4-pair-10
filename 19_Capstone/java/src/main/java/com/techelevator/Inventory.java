package com.techelevator;

import java.util.Map;

public class Inventory {

    Map<String, Products> products;

    public Inventory()
    {
    	products = InventoryLoader.getProducts();
    }
}
