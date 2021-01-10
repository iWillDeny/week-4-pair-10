package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class ProductSelectionInputTest {
	@Test
	public void matchesA1_D4_Testing_A1_Should_Return_True() {
		// arrange
		String input = "A1";

		// act
		boolean actual = VendingMachine.matchesA1_D4(input);
		boolean expected = true;

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	
	@Test
	public void matchesA1_D4_Testing_D4_Should_Return_True() {
		// arrange
		String input = "D4";

		// act
		boolean actual = VendingMachine.matchesA1_D4(input);
		boolean expected = true;

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	
	@Test
	public void matchesA1_D4_Testing_F7_Should_Return_False() {
		// arrange
		String input = "F7";

		// act
		boolean actual = VendingMachine.matchesA1_D4(input);
		boolean expected = false;

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	
	@Test
	public void matchesA1_D4_Testing_Null_Should_Return_False() {
		// arrange
		String input = "";

		// act
		boolean actual = VendingMachine.matchesA1_D4(input);
		boolean expected = false;

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	
	@Test
	public void matchesA1_D4_Testing_Too_Many_Chars_Should_Return_False() {
		// arrange
		String input = "A4XXXX";

		// act
		boolean actual = VendingMachine.matchesA1_D4(input);
		boolean expected = false;

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
}
