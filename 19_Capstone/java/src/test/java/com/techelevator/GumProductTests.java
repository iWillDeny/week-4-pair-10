package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class GumProductTests {
	@Test
	public void GumClassTummyTalk_shouldReturnChewChewYum_forTummyTalkMethod() {
		// arrange
		BigDecimal price = new BigDecimal("0.75");
		Gum Gum = new Gum("Gum", "Triplemint", "C4", price);

		String expected = "Chew Chew, Yum!";

		// act
		String actual = Gum.tummyTalk();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
}
