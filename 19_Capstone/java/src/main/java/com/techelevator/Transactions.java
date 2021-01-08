package com.techelevator;
import java.math.BigDecimal;
public class Transactions
{
	private static BigDecimal balance;
	
	public static BigDecimal getBalance()
	{
		return balance;
	}
	
	public static BigDecimal deposit()
	{
		BigDecimal deposit = UserInput.feedMoney();
		return balance.add(deposit); 
	}
	
	public static BigDecimal withdrawal()
	{
		return new BigDecimal(0);
	}
	
	
}
