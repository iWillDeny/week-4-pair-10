package com.techelevator.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Product {

    String category;
    String slotID;
    String name;
    BigDecimal price;

    public static String getCategory(){

        String itemType = "";

//        if (userSelection.contains(something pointing to candy chips drinks and gum)){
//            File fileDirectory = new File("vendingmachine1.csv");
//        } else if (userSelection.contains(something pointing to sandwiches wraps peanuts jerky)){
//            File fileDirectory = new File("vendingmachine2.csv");
//        } else if (userSelection.contains(something pointing to ipa stout lager porter)){
//            File fileDirectory = new File("vendingmachine3.csv");
//        }
        File fileDirectory = new File("vendingmachine.csv");

        try (Scanner FilesScanner = new Scanner(fileDirectory)) {
            FilesScanner.nextLine();

            while (FilesScanner.hasNextLine()) {
                String tempLine = FilesScanner.nextLine();
                String[] inventoryFileArray = tempLine.split("\\|");
                itemType = inventoryFileArray[3];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return itemType;
    }

    public static String getName(){

        String itemDescription = null;
        //        if (userSelection.contains(something pointing to candy chips drinks and gum)){
//            File fileDirectory = new File("vendingmachine1.csv");
//        } else if (userSelection.contains(something pointing to sandwiches wraps peanuts jerky)){
//            File fileDirectory = new File("vendingmachine2.csv");
//        } else if (userSelection.contains(something pointing to ipa stout lager porter)){
//            File fileDirectory = new File("vendingmachine3.csv");
//        }
        File fileDirectory = new File("vendingmachine.csv");

        try (Scanner FilesScanner = new Scanner(fileDirectory)) {
            FilesScanner.nextLine();

            while (FilesScanner.hasNextLine()) {
                String tempLine = FilesScanner.nextLine();
                String[] inventoryFileArray = tempLine.split("\\|");
                itemDescription = inventoryFileArray[1];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return itemDescription;
    }

    public static String getSlotId(){
        
        String slotAssignment = "";
        //        if (userSelection.contains(something pointing to candy chips drinks and gum)){
//            File fileDirectory = new File("vendingmachine1.csv");
//        } else if (userSelection.contains(something pointing to sandwiches wraps peanuts jerky)){
//            File fileDirectory = new File("vendingmachine2.csv");
//        } else if (userSelection.contains(something pointing to ipa stout lager porter)){
//            File fileDirectory = new File("vendingmachine3.csv");
//        }
        File fileDirectory = new File("vendingmachine.csv");

        try (Scanner FilesScanner = new Scanner(fileDirectory)) {
            FilesScanner.nextLine();

            while (FilesScanner.hasNextLine()) {
                String tempLine = FilesScanner.nextLine();
                String[] inventoryFileArray = tempLine.split("\\|");
                slotAssignment = inventoryFileArray[0];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return slotAssignment;
    }

    public static BigDecimal getPrice(){

        BigDecimal itemCost = null;
        //        if (userSelection.contains(something pointing to candy chips drinks and gum)){
//            File fileDirectory = new File("vendingmachine1.csv");
//        } else if (userSelection.contains(something pointing to sandwiches wraps peanuts jerky)){
//            File fileDirectory = new File("vendingmachine2.csv");
//        } else if (userSelection.contains(something pointing to ipa stout lager porter)){
//            File fileDirectory = new File("vendingmachine3.csv");
//        }
        File fileDirectory = new File("vendingmachine.csv");

        try (Scanner FilesScanner = new Scanner(fileDirectory)) {
            FilesScanner.nextLine();

            while (FilesScanner.hasNextLine()) {
                String tempLine = FilesScanner.nextLine();
                String[] inventoryFileArray = tempLine.split("\\|");
                String productCostString = inventoryFileArray[2];
                Long tempLong = Long.valueOf((productCostString));
                itemCost = BigDecimal.valueOf(tempLong);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return itemCost;
    }

}
