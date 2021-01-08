package com.techelevator;

import java.math.BigDecimal;

public class Playground
{

	public static void main(String[] args)
	{
	
			BigDecimal oneHundred = new BigDecimal(100);
			BigDecimal balance = new BigDecimal(1.80);
			BigDecimal change = balance.multiply(oneHundred);
			int newChange = change.intValue();
			int quarters = newChange / 25;
			int dimes = (newChange % 25) / 10;
			int nickels = ((newChange % 25) % 10) / 5;
			
			System.out.println("Your change is " + quarters + " quarters " + dimes + " dimes and " + nickels + " nickels");
		

	}

}
