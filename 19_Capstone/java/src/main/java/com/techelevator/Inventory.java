package com.techelevator;

import java.util.Map;

public class Inventory {

    static Map<String, Products> products;

    public Inventory()
    {
    	products = InventoryLoader.getProducts();
    }
    public static Map<String, Products> getInventory() {
    	return products;
    }
    
    public static Products getProductbyId(String SlotId)
    {
    	return products.get(SlotId);
    }
    
    public Map<String, Products> getProducts()
    {
    	return products;
    }

}
