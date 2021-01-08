package com.techelevator;

import java.math.BigDecimal;

public class VendingMachine 
{
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
                System.out.println("GoodBye");
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
				UserOutput.displayMoneyInputOptions();
				System.out.println("Initial Balance: " + Transactions.getBalance());
				BigDecimal feedMoneyCapture = UserInput.feedMoney();
				System.out.println("This is the amount deposited: " + feedMoneyCapture);
				Transactions.deposit(feedMoneyCapture);
				System.out.println("Updated Balance: " + Transactions.getBalance());

//        	System.out.println(Transactions.getBalance());
			}
			else if (buyProductsMenuChoice.contains("2")) 
			{
				System.out.println("This Should be a product list");
			}
			else if (buyProductsMenuChoice.contains("3")) 
			{
				System.out.println(UserOutput.returnChange());
				break;
			}
		}
	}
}
