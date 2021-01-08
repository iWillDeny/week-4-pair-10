package com.techelevator;
import java.math.BigDecimal;
public class Transactions
{
	private static BigDecimal balance = new BigDecimal(0);
	
	
	
	public static BigDecimal getBalance()
	{
		return balance;
	}
	
	public static BigDecimal deposit(BigDecimal deposit)
	{
		balance = balance.add(deposit);
		return balance;
	}
	
	public static BigDecimal withdrawal()
	{
		return new BigDecimal(0);
	}
	
//	public static BigDecimal addfeedMoney()
//	{
//		
//	}
}
