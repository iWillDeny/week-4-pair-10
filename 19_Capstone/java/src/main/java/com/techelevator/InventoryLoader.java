package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryLoader {



    public List<Products> getProducts(){

        List<Products> productsList = new ArrayList<>();
        File fileDirectory = new File("vendingmachine.csv");

        try (Scanner inventoryFilesScanner = new Scanner(fileDirectory)) {
            inventoryFilesScanner.nextLine();

            while (inventoryFilesScanner.hasNextLine()) {
                String tempLine = inventoryFilesScanner.nextLine();
                String[] inventoryFileArray = tempLine.split("|");
                String slotId = inventoryFileArray[0];
                String productName = inventoryFileArray[1];
                BigDecimal price = new BigDecimal(inventoryFileArray[2]);
                String productType = inventoryFileArray[3];
                Products productWriter = new Products(productType, productName, slotId, price);
                productsList.add(productWriter);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return productsList;
    }
}
