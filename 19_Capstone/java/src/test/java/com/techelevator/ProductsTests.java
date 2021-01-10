package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ProductsTests
{
	@Test
	public void ProductsgetName_returnsPotatoCrisps_whenUsingGetName() {
		// arrange
		BigDecimal price = new BigDecimal("3.05");
		Chip potatoChip = new Chip("Chip", "Potato Crisp", "A1", price);
		
		String expected = "Potato Crisp";

		// act
		String actual = potatoChip.getProductName();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	@Test
	public void ProductsgetQuantity_returns5_afterInitializingNewClass() {
		// arrange
		BigDecimal price = new BigDecimal("3.05");
		Chip potatoChip = new Chip("Chip", "Potato Crisp", "A1", price);
		
		int expected = 5;

		// act
		int actual = potatoChip.getQuantity();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	
	@Test
	public void ProductsgetQuantity_returns4_afterPurchasingChips() {
		// arrange
		BigDecimal price = new BigDecimal("3.05");
		Chip potatoChip = new Chip("Chip", "Potato Crisp", "A1", price);
		
		int expected = 4;
		potatoChip.purchase();
		
		// act
		int actual = potatoChip.getQuantity();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	@Test
	public void ProductsgetSlotId_returnsA1_afterRetrievingSlotID() {
		// arrange
		BigDecimal price = new BigDecimal("3.05");
		Chip potatoChip = new Chip("Chip", "Potato Crisp", "A1", price);
		
		
		String expected = potatoChip.getSlotId();
		
		// act
		String actual = potatoChip.getSlotId();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	@Test
	public void ProductsgetPrice_returns305_afterRetrievingPrice() {
		// arrange
		BigDecimal price = new BigDecimal("3.05");
		Chip potatoChip = new Chip("Chip", "Potato Crisp", "A1", price);
		
		
		BigDecimal expected = new BigDecimal("3.05");
		
		// act
		BigDecimal actual = potatoChip.getPrice();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	@Test
	public void ProductsgetProductType_returnsChip_afterRunningGetProductType() {
		// arrange
		BigDecimal price = new BigDecimal("3.05");
		Chip potatoChip = new Chip("Chip", "Potato Crisp", "A1", price);
		
		
		String expected = "Chip";
		
		// act
		String actual = potatoChip.getProductType();

		// assert
		Assert.assertEquals("Expected output " + expected + " but returned " + actual, expected, actual);
	}
	
}
