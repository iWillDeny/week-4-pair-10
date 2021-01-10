package com.techelevator;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TransactionsTests
{
	@Test
	public void TransactionsGetBalance_shouldReturnZeroBalance_whenThereIsNoMoney() {
		// arrange
		BigDecimal balance = Transactions.getBalance();
		
		BigDecimal expected = balance;

		// act
		BigDecimal actual = Transactions.getBalance();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	@Test
	public void TransactionsDeposit_shouldReturnTwentyDollars_whenTwentyDollarsIsDeposited() {
		// arrange
		BigDecimal actual = Transactions.getBalance();
		BigDecimal deposit = new BigDecimal("20.00");
		BigDecimal expected = new BigDecimal("20.00");
		

		// act
		actual = Transactions.deposit(deposit);

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	@After
	public void teardown() {
		System.out.println("teardown - this code runs AFTER EACH test @After");
		BigDecimal balance = new BigDecimal("0.00");
		System.out.println();
	}
	
	@Test
	public void TransactionsDeposit_shouldReturn75cents_whenInitalBalanceisTwoDollarsAndWithDrawalEquals125() {
		// arrange
		BigDecimal withdrawal = new BigDecimal("1.25");
		BigDecimal expected = new BigDecimal("18.75");
		

		// act
		BigDecimal actual = Transactions.withdrawal(withdrawal);

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	
	
}
