package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class DrinkProductTests {
	@Test
	public void DrinkClassTummyTalk_shouldReturnGlugGlugYum_forTummyTalkMethod() {
		// arrange
		BigDecimal price = new BigDecimal("1.25");
		Drink drink = new Drink("Drink", "Cola", "C1", price);

		String expected = "Glug Glug, Yum!";

		// act
		String actual = drink.tummyTalk();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}

}
