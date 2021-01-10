package com.techelevator;

import java.lang.Character.UnicodeBlock;
import java.math.BigDecimal;
import java.security.PublicKey;

import javax.imageio.stream.ImageOutputStream;

public class VendingMachine 
{
	private Inventory products = new Inventory();
	private Logger activityLogger = new Logger();
	
    public void run()
    {
    	
        while(true)
        {
        	
            UserOutput.displayHomeScreenOptions();
            String choice = UserInput.GetHomeScreenOption();
            
            if(choice.equals("display"))
            {
            	UserOutput.displayInventoryList(products);
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

    public void buyProducts()
	{
    	
		while (true)
		{
//			this begins the sequence at the "(2) Purchase" menu
			UserOutput.displayPurchaseMenuOptions();
			String buyProductsMenuChoice = UserInput.purchaseMenu();
//			
			if (buyProductsMenuChoice.contains("1"))
			{
				BigDecimal preTransactionBalance =  Transactions.getBalance();
				UserOutput.displayBalance();
				UserOutput.displayMoneyInputOptions();
				UserOutput.takeMoneyUpdateBalance();
				UserOutput.displayBalance();
				activityLogger.logMessage("FEED MONEY: $" + preTransactionBalance + " $" + Transactions.getBalance());
//				break;


//			This begins the sequence at the second menu
			}
			else if (buyProductsMenuChoice.contains("2")) 
			{
				BigDecimal balanceCheck = new BigDecimal("0.00");
				UserOutput.displayInventoryList(products);
				UserOutput.requestProductSelection();
				String userProductSelect = UserInput.productSelectionUserInput();
//				UnicodeBlock.AN returnUnicode = U+23CE;
//				make sure user input matches possible selections
				if (!matchesA1_D4(userProductSelect))
				{	
					UserOutput.displayIncorrectSelectionMessage();
					break;
				} 
//				else
//				{
//					UserOutput.displayPurchaseMenuOptions();
//				}
//				make sure user has enough money to make the purchase	
				if (Transactions.getBalance().compareTo(returnProductCost(userProductSelect)) < 0)
				{
					UserOutput.displayPleaseAddMoney();
				}
//				user buys product after checking to make sure product is in stock. 
				else
				{	
					BigDecimal preTransactionBalance = Transactions.getBalance();
					Products productSelected = Inventory.getProductbyId(userProductSelect);
					if(productSelected.getQuantity() <  1)
					{
						UserOutput.displaySoldOutMessage();
						continue;
					}
					UserOutput.displayUserOrderInfo(productSelected);
					activityLogger.logMessage(productSelected.getProductName() +  " " + productSelected.getSlotId() + " $" + preTransactionBalance + " $" + Transactions.getBalance());
					productSelected.purchase();
				}
				
			}
//			gives the user their change	
			else if (buyProductsMenuChoice.contains("3")) 
			{
				BigDecimal preCheckoutBalance = Transactions.getBalance();
				UserOutput.returnChange();
				Transactions.withdrawal(Transactions.getBalance());
				activityLogger.logMessage("GIVE CHANGE: $" + preCheckoutBalance + " $" + Transactions.getBalance());
				
				break;
			}
		}
	
	}
    
    public static BigDecimal returnProductCost(String slotId) 
	{
		BigDecimal cost = Inventory.getInventory().get(slotId).getPrice();
		return cost;
	}
    
    public static boolean matchesA1_D4(String selection)
    {
    	boolean matches = (( selection.length() > 0)
    				   && ( selection.length() < 3)) 
    				   && ( selection.substring(0, 1).equals("A") 
    					 || selection.substring(0, 1).equals("B")
    					 || selection.substring(0, 1).equals("C")
    					 || selection.substring(0, 1).equals("D"))
    					&& (selection.substring(1, 2).equals("1")
    					 || selection.substring(1, 2).equals("2")
    					 || selection.substring(1, 2).equals("3")
    					 || selection.substring(1, 2).equals("4"))
    					;
    	
    	return matches;
    }
}

