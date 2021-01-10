package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

//NOT CURRENTLY WORKING AS EXPECTED


public class FeedMoneyInOutTests {
	
	@Test
	public void FeedMoneyTest_ShouldReturn1_FeedMoneyMethod() {
		// arrange
		String userSelection = "1";
		// act
		BigDecimal actual = UserInput.feedMoney();
		BigDecimal expected = new BigDecimal("1.00");
		
		

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
}

