package com.techelevator;

import java.math.BigDecimal;

public class VendingMachine 
{
	private Inventory inventoryMap = new Inventory();
	
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
				UserOutput.displayMoneyInputOptions();
				System.out.println("_________________________________________");
				System.out.println();
				System.out.println("Balance: $" + Transactions.getBalance());
				BigDecimal feedMoneyCapture = UserInput.feedMoney();
				System.out.println("_________________________________________");
				System.out.println();
				System.out.println("Deposited: " + feedMoneyCapture);
				Transactions.deposit(feedMoneyCapture);
				System.out.println();
				System.out.println("Balance: $" + Transactions.getBalance());
				System.out.println("_________________________________________");


//        	System.out.println(Transactions.getBalance());
			}
			else if (buyProductsMenuChoice.contains("2")) 
			{
				UserOutput.displayInventoryList();
			}
			else if (buyProductsMenuChoice.contains("3")) 
			{
				UserOutput.returnChange();
				break;
			}
		}
	}
}
