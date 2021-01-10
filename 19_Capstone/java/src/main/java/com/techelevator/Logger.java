package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Logger 
{
	 
	 public void logMessage(String message)
	 {
	 	 String fileName = "log.txt";
	     File logFile = new File(fileName);
	     
	     LocalDate date = LocalDate.now();
	     DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	     String currentDay = date.format(formatterDay);
	     
	     LocalTime time = LocalTime.now();
	     DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("hh:mm:ss a");
	     String currentTime = time.format(formatterTime);

	     // open the log file to append 
	     try(FileOutputStream outputStream = new FileOutputStream(logFile, true);
	         PrintWriter writer = new PrintWriter(outputStream);)
	     {
	         String line = String.format("%s %s %s",currentDay, currentTime, message);
	         writer.println(line);
	     }
	     catch(Exception ex)
	     {
	         //swallow
	     }
	 }
	 
//	 public void salesReport(String message)
//	    {
//		 
//		 LocalDate date = LocalDate.now();
//	     DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//	     String currentDay = date.format(formatterDay);
//	     
//	     LocalTime time = LocalTime.now();
//	     DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("hh:mm:ss a");
//	     String currentTime = time.format(formatterTime);
//	     
//		 String fileName = ".txt";
//	     File logFile = new File(fileName);
//	     
//	    
//
//	     // open the log file to append 
//	     try(FileOutputStream outputStream = new FileOutputStream(logFile, true);
//	         PrintWriter writer = new PrintWriter(outputStream);)
//	     {
//	         String line = String.format("%s %s %s",currentDay, currentTime, message);
//	         writer.println(line);
//	     }
//	     catch(Exception ex)
//	     {
//	         //swallow
//	     }
//	    }
//	 
//	 public void salesReportWriter() 
//	 {
//		 
//		 
//		 LocalDate date = LocalDate.now();
//	     DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//	     String currentDay = date.format(formatterDay);
//	     
//	     
//	 		
////	        String a1 = "Potato Crisps";
////	        String a2 = "Stackers";
////	        String a3 = "Grain Waves";
////	        String a4 = "Cloud Popcorn";
////	        String b1 = "Moon Pie";
////	        String b2 = "Cowtales";
////	        String b3 = "Wonka Bar";
////	        String b4 = "Crunchie";
////	        String c1 = "Cola";
////	        String c2 = "Dr. Salt";
////	        String c3 = "Mountain Melter";
////	        String c4 = "Heavy";
////	        String d1 = "U-Chews";
////	        String d2 = "Little League Chew";
////	        String d3 = "Chiclets";
////	        String d4 = "Triplemint";
//	     
//	     
//	        //initialize and word and sentence count
//	 		int productCount = 0;
//	 		int sentenceCount = 0;
//	 		
//	 		//point to the file's location
//	 		//String sentenceData = "alices_adventures_in_wonderland.txt";
//	 		
//	 		//create a new file object
//	 		File newFile = new File("Sales_Report.txt");
//	 		
//	 		//create a scanner
//	 		Scanner scanner = new Scanner(newFile);
//	 		
//	 		//create a string that will hold the sentence that we read in
//	 		String tempLine = " ";
//	 		
//	 		//loop over the file line by line until there are no more lines
//	 		while(scanner.hasNext())
//	 		{
//
//	 			tempLine = scanner.next();
//	 			
//	 			
//	 			//count the number of words in the line
//	 			productCount++;
//	 			
//	 			//split apart the line into individual characters by the lack of white space
//	 			if(tempLine.contains("A1") || tempLine.endsWith("!") || tempLine.endsWith("?"))
//	 			{
//	 				sentenceCount++;
//	 			}
//	 			
//	 		
//	 		}
//	 		//return the word and sentence count
//	 				System.out.println("Word Count: " + productCount);
//	 				System.out.println("Sentence Count: " + sentenceCount);
//	 	
//
//	 }

}
