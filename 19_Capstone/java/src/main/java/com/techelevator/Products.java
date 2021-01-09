package com.techelevator;

import java.math.BigDecimal;

public abstract class Products {
	
	String productType = "";
	String productName;
	String slotId;
	BigDecimal price;
	int quantity = 5;
	
	public int getQuantity() 
	{
		return quantity;
	}

	public void purchase()
	{
		quantity --;	
	}
	
	public String getProductName() {
		return productName;
	}
	public String getSlotId() {
		return slotId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public String getProductType() {
		return productType;
	}
	
	
	public Products(String productType, String productName, String slotId, BigDecimal price) {
        
		this.productName = productName;
        this.slotId = slotId;
        this.price = price;
        this.productType = productType;
    }
	
	public abstract String tummyTalk();
//	{
//		if (productType.equals("Chip")) {
//			return "Crunch Crunch, Yum!";
//		}else if (productType.equals("Drink")) {
//			return "Glug Glug, Yum!";
//		}else if (productType.equals("Candy")){
//			return "Munch Munch, Yum!";
//		}else {
//			return "Chew Chew, Yum!";
//		}
//
//	}
}
