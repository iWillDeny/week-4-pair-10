package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
	
//	private static 
	
	public static String GetHomeScreenOption() {
		
		Scanner userSelection = new Scanner(System.in);
		
		String mainMenuUserInput = userSelection.nextLine();
		String usersSelection = mainMenuUserInput.trim().toLowerCase();
		
		if (usersSelection.contains("1")) {
			return "display";
		} else if (usersSelection.contains("2")) {
			return "buy";
		} else if (usersSelection.contains("3")) {
			return "quit";
		} else {
			return "";
		
		}
		
	}
	
	public static String productSelectionUserInput()
	{
		Scanner userSelection = new Scanner(System.in);
		
		String userProductSelectionInput = userSelection.nextLine();
		String usersSelection = userProductSelectionInput.toUpperCase();
		
		return usersSelection;
	}
	
	public static String purchaseMenu()
	{
		Scanner userSelection = new Scanner(System.in);
		
		String mainMenuUserInput = userSelection.nextLine();
		String usersSelection = mainMenuUserInput.trim().toLowerCase();
		
		return usersSelection;
		
	}
	
	public static BigDecimal feedMoney() {
		
		Scanner userSelection = new Scanner(System.in);
		
		BigDecimal one1 = new BigDecimal("1.00");
		BigDecimal two2 = new BigDecimal("2.00");
		BigDecimal five5 = new BigDecimal("5.00");
		BigDecimal ten10 = new BigDecimal("10.00");
		BigDecimal twen20 = new BigDecimal("20.00");
		String denominationUserInput = userSelection.nextLine();
		String usersSelection = denominationUserInput.trim();
		
		if (usersSelection.contains("1")) {
			return one1;
		} else if (usersSelection.contains("2")) {
			return two2;
		} else if (usersSelection.contains("3")) {
			return five5;
		} else if (usersSelection.contains("4")) {
			return ten10;
		} else if (usersSelection.contains("5")) {
			return twen20;
		} else if (usersSelection.contains("6")) {
			return new BigDecimal("0.00");
		} else {
			return new BigDecimal("0.00");
		}
	}
	

}
