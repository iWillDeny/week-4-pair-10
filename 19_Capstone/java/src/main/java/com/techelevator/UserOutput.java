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
		System.out.println("Your change is: $" + Transactions.getBalance());
		System.out.println();
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes:    " +    dimes);
		System.out.println("Nickels:  " + nickels);
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
		System.out.println("(6) Return to menu");
		System.out.println("_________________________________________");
	}
	
	public static void displayBalance()
	{
		System.out.println();
		System.out.println("Balance: $" + Transactions.getBalance());
		System.out.println("_________________________________________");
	}
	
	
	public static void takeMoneyUpdateBalance()
	{
		
		BigDecimal feedMoneyCapture = UserInput.feedMoney();
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Deposited: " + feedMoneyCapture);
		Transactions.deposit(feedMoneyCapture);
		
	}
	
//	public static void displayFundingMessage(String slotId)
//	{
//		if (Transactions.getBalance().compareTo(returnProductCost(slotId)) < 0)
//		{
//			System.out.println("put some money in");
//		}
//	}
	
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
	
	public static void requestProductSelection()
	{
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Please enter product location ID");
		System.out.println("_________________________________________");

	}
	
	public static void displayInventoryList(Inventory inventory) 
	{
		Map<String, Products> prod = inventory.getProducts();
		for(Map.Entry<String, Products> entry: prod.entrySet())
		{
			String getSlotId = entry.getValue().getSlotId();
			BigDecimal getPrice = entry.getValue().getPrice();
			String getName = entry.getValue().getProductName();
			int getQuantity = entry.getValue().getQuantity();
			
			System.out.println(getSlotId + " " + getName + " " + "$" + getPrice + " " + "QTY: " + getQuantity);
		}
		
	}
	
	public static void displayIncorrectSelectionMessage()
	{
		System.out.println("_________________________________________");
		System.out.println();
    	System.out.println("Please enter a valid location ID");
    	System.out.println("_________________________________________");
	}
	
	public static void displayUserOrderInfo(Products product)
	{
		String itemName = product.getProductName();
		BigDecimal cost = product.getPrice();
		String tummyLove = product.tummyTalk();
		BigDecimal remainingBalance = Transactions.withdrawal(cost);
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Purchased: " + itemName);
		System.out.println("Cost: $" + cost);
		System.out.println("Balance: $" + remainingBalance);
		System.out.println(tummyLove);
    	System.out.println("_________________________________________");


	}
	
	public static String gumYum()
	{
		return "Chew Chew, Yum!";
	}
	
	public static String candyYum()
	{
		return "Munch Munch, Yum!";
	}
	
	public static String drinkYum()
	{
		return "Glug Glug, Yum!";
	}
	
	public static String chipYum()
	{
		return "Crunch Crunch, Yum!";
	}
	
	public static void displayPleaseAddMoney()
	{
		
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println("Please add money before making a selection");
		System.out.println("_________________________________________");
	}
	
	public static void displaySoldOutMessage()
	{
		System.out.println("_________________________________________");
		System.out.println();
    	System.out.println("         SOLD OUT");
    	System.out.println("Please make another selection");
    	System.out.println("_________________________________________");
	}
		
	
	
	public static void quit()
	{
		System.out.println("_________________________________________");
		System.out.println();
    	System.out.println("   Thank you for using Vendo-Matic 800");
        System.out.println("          Have a nice day! " + '\u263A');
        System.out.println();
        System.out.println("       Umbrella Corporation 2021");
        System.out.println();
        System.out.println(" For questions or comments please contact:");
        System.out.println("       model101@cyberdyne.skynet");
        System.out.println("          Cyberdyne Systems");
        System.out.println("18144 El Camino Real, Sunnyvale, California");
    	System.out.println("_________________________________________");
	}
}
