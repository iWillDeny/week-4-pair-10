package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class InventoryLoader {



    public static Map<String, Products> getProducts(){

        Map<String, Products> productsList = new TreeMap<>();
        
        
        File fileDirectory = new File("vendingmachine.csv");

        try (Scanner inventoryFilesScanner = new Scanner(fileDirectory)) {
            //inventoryFilesScanner.nextLine();

            while (inventoryFilesScanner.hasNextLine()) {
                String tempLine = inventoryFilesScanner.nextLine();
                String[] inventoryFileArray = tempLine.split("\\|");
                String slotId = inventoryFileArray[0];
                String productName = inventoryFileArray[1];
                BigDecimal price = new BigDecimal(inventoryFileArray[2]);
                String productType = inventoryFileArray[3];
                
                Products productWriter;
                
                // if statement to determine which type of product to create
                if (productType.equals("Chip"))
                {
                	productWriter = new Chip(productType, productName, slotId, price);
                }
                else if (productType.equals("Candy"))
                {
                	productWriter = new Candy(productType, productName, slotId, price);
                }
                else if (productType.equals("Drink"))
                {
                	productWriter = new Drink(productType, productName, slotId, price);
                }
                else
                {
                	productWriter = new Gum(productType, productName, slotId, price);
                }
      
                productsList.put(slotId, productWriter);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return productsList;
    }
}
