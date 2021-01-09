package com.techelevator;

import java.math.BigDecimal;
import java.security.KeyStore.Entry;
import java.security.PublicKey;
import java.util.Map;

public class UserOutput {

	public static void returnChange()
	{
		BigDecimal oneHundred = new BigDecimal(100);
		BigDecimal change = Transactions.getBalance().multiply(oneHundred);
		int newChange = change.intValue();
		int quarters = newChange / 25;
		int dimes = (newChange % 25) / 10;
		int nickels = ((newChange % 25) % 10) / 5;
		
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Your change is");
		System.out.println();
		System.out.println("Quarters: " + quarters + " ($" + quarters * .25 + "0)");
		System.out.println("Dimes:    " +    dimes + " ($" + dimes * .10 + "0)");
		System.out.println("Nickels:  " + nickels + " ($" + nickels * .05 + "0)");
		System.out.println("_________________________________________");
		
	}
	
	public static void displayMoneyInputOptions()
	{
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Please select deposit amount");
		System.out.println();
		System.out.println("(1) $1.00");
		System.out.println("(2) $2.00");
		System.out.println("(3) $5.00");
		System.out.println("(4) $10.00");
		System.out.println("(5) $20.00");
		System.out.println("_________________________________________");
	}
	
	public static void displayPurchaseMenuOptions()
	{
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Please make a selection");
		System.out.println();
		System.out.println("(1) Feed Money");
		System.out.println("(2) Select Product");
		System.out.println("(3) Finish Transaction");
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Balance: $" + Transactions.getBalance());
		System.out.println("_________________________________________");

	}
	
	public static void displayHomeScreenOptions() 
	{
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Please make a selection");
		System.out.println();
		System.out.println("(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		System.out.println("_________________________________________");

	}
	
	public static void displayInventoryList() 
	{
		Map<String, Products> prod = InventoryLoader.getProducts();
		for(Map.Entry<String, Products> entry: prod.entrySet())
		{
			String getSlotId = entry.getValue().getSlotId();
			BigDecimal getPrice = entry.getValue().getPrice();
			String getName = entry.getValue().getProductName();
			int getQuantity = entry.getValue().getQuantity();
			
			System.out.println(getSlotId + " " + getName + " " + "$" + getPrice + " " + "QTY: " + getQuantity);
		}
		
	
		System.out.println();
		System.out.println("Please enter product location ID");
	}
	
	//This method checks to see if the user selection exists as a slotID;
	public static boolean displayKey(String selection)
	{
		boolean temp = Inventory.getInventory().containsKey(selection);
		return temp;
	}
	
	public static String displayUserOrderInfo(String slotID)
	{
		String itemName = Inventory.getInventory().get(slotID).getProductName();
		BigDecimal cost = Inventory.getInventory().get(slotID).getPrice();
		String classOfProduct = Inventory.getInventory().get(slotID).getProductType();
		String tummyLove = Products.tummyTalk(classOfProduct);
		BigDecimal remainingBalance = Transactions.getBalance().subtract(cost);
		return "You purchased " + itemName + " which cost $" + cost + 
				" and you have $" + remainingBalance + " left to spend on yummy treats. " +
		"Also " + tummyLove;
	}
		
	
	
	public static void quit()
	{
		System.out.println("_________________________________________");
		System.out.println();
    	System.out.println(" Thank you for using Vendo-Matic 800");
        System.out.println("         Have a nice day! " + '\u263A');
        System.out.println("     Umbrella Corporation 2021");
        System.out.println("For questions or comments please contact");
        System.out.println(" Cyberdyne Systems www.cyberdyne.skynet");
    	System.out.println("_________________________________________");
	}
}
