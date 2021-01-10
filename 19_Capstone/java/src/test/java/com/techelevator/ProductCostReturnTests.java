package com.techelevator;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

//  NOT CURRENTLY WORKING AS EXPECTED

public class ProductCostReturnTests {
	@Test
	public void ProductCostReturnFromSlotID_Testing_A1_Should_Return_Price() {
		// arrange
//		String input = "A1";

		// act
		BigDecimal actual = VendingMachine.returnProductCost("A1");
		BigDecimal expected = new BigDecimal("3.05");
		
		

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
}
