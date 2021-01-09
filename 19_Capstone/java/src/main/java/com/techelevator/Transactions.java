package com.techelevator;
import java.math.BigDecimal;
public class Transactions
{
	private static BigDecimal balance = new BigDecimal("0.00");
	
	
	
	public static BigDecimal getBalance()
	{
		return balance;
	}
	
	public static BigDecimal deposit(BigDecimal deposit)
	{
		balance = balance.add(deposit);
		return balance;
	}
	
	public static BigDecimal withdrawal(BigDecimal withdrawal)
	{
	
		balance = balance.subtract(withdrawal);
		return balance;
		
	}
	
//	public static BigDecimal addfeedMoney()
//	{
//		
//	}
}
