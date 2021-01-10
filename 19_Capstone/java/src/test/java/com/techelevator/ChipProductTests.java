package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ChipProductTests
{
	@Test
	public void ChipClassTummyTalk_shouldReturnCrunchCrunchYum_forTummyTalkMethod(){
		//arrange
		BigDecimal price = new BigDecimal("3.05");
		Chip chip = new Chip("Chip", "Potato Crisp", "A1", price);
		
		
		String expected = "Crunch Crunch, Yum!";
		
		//act
		String actual = chip.tummyTalk();
		
		
		//assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
}
