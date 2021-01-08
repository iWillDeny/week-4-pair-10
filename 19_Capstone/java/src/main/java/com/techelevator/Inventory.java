package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    Map<String, Products> products;

    public Inventory()
    {
    	products = InventoryLoader.getProducts();
    }
}
