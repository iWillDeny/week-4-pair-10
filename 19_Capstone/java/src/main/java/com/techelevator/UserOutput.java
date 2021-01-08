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
	
}
