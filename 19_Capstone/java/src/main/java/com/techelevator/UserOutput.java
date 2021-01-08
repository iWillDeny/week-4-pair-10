package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;

public class UserOutput {

	public static String returnChange()
	{
		BigDecimal oneHundred = new BigDecimal(100);
		BigDecimal change = Transactions.getBalance().multiply(oneHundred);
		int newChange = change.intValue();
		int quarters = newChange / 25;
		int dimes = (newChange % 25) / 10;
		int nickels = ((newChange % 25) % 10) / 5;
		
		return "Your change is " + quarters + " quarters" + dimes + " dimes" + nickels + " nickels";
	}
	
	public static void displayMoneyInputOptions()
	{
		System.out.println("Please select desired deposit denomination");
		System.out.println();
		System.out.println("(1) $1.00");
		System.out.println("(2) $2.00");
		System.out.println("(3) $5.00");
		System.out.println("(4) $10.00");
		System.out.println("(5) $20.00");
	}
	
	public static void displayPurchaseMenuOptions()
	{
		System.out.println("Please make a selection");
		System.out.println("(1) Feed Money");
		System.out.println("(2) Select Product");
		System.out.println("(3) Finish Transaction");
		System.out.println("Current Money Provided: " + Transactions.getBalance());
	}
	
	public static void displayHomeScreenOptions() 
	{
		System.out.println("Please make a selection");
		System.out.println("(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
	}
	
	public static void displayInventoryList() 
	{
		System.out.println("This is where we show the product list");
	}
}
