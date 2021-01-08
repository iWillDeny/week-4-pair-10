package com.techelevator;



public class VendingMachine 
{
    public void run()
    {
    	
        while(true)
        {
            String choice = "display";

            if(choice.equals("display"))
            {
                UserInput.GetHomeScreen();
            }
            else if(choice.equals("buy"))
            {
                UserInput.feedMoney();
            }
            else if(choice.equals("quit"))
            {
                // good bye
                break;
            }
        }
    }

    
}
