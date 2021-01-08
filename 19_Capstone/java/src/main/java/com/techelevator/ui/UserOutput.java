package com.techelevator.ui;

import com.techelevator.model.Inventory;

import java.util.Map;

public class UserOutput {

public static Map retrieveInventory(){

    return Inventory.inventoryDisplay();
}
}
