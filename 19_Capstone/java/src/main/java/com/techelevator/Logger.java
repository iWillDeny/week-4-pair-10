package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
	 
	 public void salesReport(String message)
	    {
		    String fileName = "Sales_report.txt";
	        File salesReport = new File(fileName);

	       
	        // open the log file to append 
	        try(FileOutputStream outputStream = new FileOutputStream(salesReport, true);
	            PrintWriter writer = new PrintWriter(outputStream);)
	        {
	            String line = String.format(message);
	            writer.println(line);
	        }
	        catch(Exception ex)
	        {
	            //swallow
	        }
	    }
	 
//	 public void salesReportWriter() 
//	 {
//	 		
//	 		//initialize and word and sentence count
//	 		int wordCount = 0;
//	 		int sentenceCount = 0;
//	 		
//	 		//point to the file's location
//	 		//String sentenceData = "alices_adventures_in_wonderland.txt";
//	 		
//	 		//create a new file object
//	 		File newFile = new File("log.txt");
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
//	 			wordCount++;
//	 			
//	 			//split apart the line into individual characters by the lack of white space
//	 			if(tempLine.endsWith(".") || tempLine.endsWith("!") || tempLine.endsWith("?"))
//	 			{
//	 				sentenceCount++;
//	 			}
//	 			
//	 		
//	 		}
//	 		//return the word and sentence count
//	 				System.out.println("Word Count: " + wordCount);
//	 				System.out.println("Sentence Count: " + sentenceCount);
//	 	
//
//	 }

}
