package com.techelevator;

import java.math.BigDecimal;
import java.security.PublicKey;

public class VendingMachine 
{
	private Inventory products = new Inventory();
	
    public void run()
    {
    	
        while(true)
        {
        	
            UserOutput.displayHomeScreenOptions();
            String choice = UserInput.GetHomeScreenOption();
            
            if(choice.equals("display"))
            {
            	showProducts();
            }
            else if(choice.equals("buy"))
            {
                buyProducts();
            }
            else if(choice.equals("quit"))
            {
            	UserOutput.quit();
                break;
            }
            else 
            {
            	break;
            }
        }

    }
    public void showProducts()
    {
    	UserOutput.displayInventoryList();
    }
    
    public void buyProducts()
	{
    	
		while (true)
		{
			UserOutput.displayPurchaseMenuOptions();

			String buyProductsMenuChoice = UserInput.purchaseMenu();
			if (buyProductsMenuChoice.contains("1"))
			{
				UserOutput.displayBalance();
				UserOutput.displayMoneyInputOptions();
				UserOutput.takeMoneyUpdateBalance();
				UserOutput.displayBalance();


//        	System.out.println(Transactions.getBalance());
			}
			else if (buyProductsMenuChoice.contains("2")) 
			{
				UserOutput.displayInventoryList();
				UserOutput.requestProductSelection();
				String userProductSelect = UserInput.productSelectionUserInput();
//				System.out.println(UserOutput.displayKey(userProductSelect));
				Transactions.withdrawal(returnProductCost(userProductSelect));
				System.out.println(UserOutput.displayUserOrderInfo(userProductSelect));
			}
			else if (buyProductsMenuChoice.contains("3")) 
			{
				UserOutput.returnChange();
				break;
			}
		}
	}
    
    public static BigDecimal returnProductCost(String slotId) 
	{
		BigDecimal cost = Inventory.getInventory().get(slotId).getPrice();
		return cost;
	}
}
