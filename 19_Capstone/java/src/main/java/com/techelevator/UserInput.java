package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
	
//	private static Scanner userSelection = new Scanner(System.in);
	
	public static String GetHomeScreen() {
		
		System.out.println("Please make a selection");
		System.out.println("(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
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
	
	public static 
	
	public static BigDecimal feedMoney() {
		
		BigDecimal one1 = new BigDecimal(1.00);
		BigDecimal two2 = new BigDecimal(2.00);
		BigDecimal five5 = new BigDecimal(5.00);
		BigDecimal ten10 = new BigDecimal(10.00);
		BigDecimal twen20 = new BigDecimal(20.00);
		String denominationUserInput = userSelection.nextLine();
		String usersSelection = denominationUserInput.trim().toLowerCase();
		System.out.println("Please select desired deposit denomination");
		System.out.println();
		System.out.println("(1) $1.00");
		System.out.println("(2) $2.00");
		System.out.println("(3) $5.00");
		System.out.println("(4) $10.00");
		System.out.println("(5) $20.00");
		
		if (usersSelection.contains("1")) {
			return one1;
		} else if (usersSelection.contains("2")) {
			return two2;
		} else if (usersSelection.contains("3")) {
			return five5;
		} else if (usersSelection.contains("4")) {
			return ten10;
		} else {
			return twen20;
		}
	}
	

}
