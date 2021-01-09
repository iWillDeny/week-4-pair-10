package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Products 
{

	public Candy(String productType, String productName, String slotId, BigDecimal price) 
	{
		super(productType, productName, slotId, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tummyTalk() {
		// TODO Auto-generated method stub
		return UserOutput.candyYum();
	}

}
