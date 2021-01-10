package com.techelevator;

import java.math.BigDecimal;
import java.util.List;

public class Playground
{

	public static void main(String[] args)
	{
		System.out.println(matchesA1_D4("A9"));
	}
	public static boolean matchesA1_D4(String selection)
    {
    	boolean matches1 = ( selection.substring(0, 1).equals("A")
    					 || selection.substring(0, 1).equals("B")
    					 || selection.substring(0, 1).equals("C")
    					 || selection.substring(0, 1).equals("D"))
    				 && (selection.substring(1, 2).equals("1")
    					 || selection.substring(1, 2).equals("2")
    					 || selection.substring(1, 2).equals("3")
    					 || selection.substring(1, 2).equals("4"));
    	
    	return matches1;
    }
	
}
