package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class CandyProductTests {
	@Test
	public void CandyClassTummyTalk_shouldReturnMunchMunchYum_forTummyTalkMethod() {
		// arrange
		BigDecimal price = new BigDecimal("1.80");
		Candy candy = new Candy("Candy", "Moonpie", "B1", price);

		String expected = "Munch Munch, Yum!";

		// act
		String actual = candy.tummyTalk();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}

}
