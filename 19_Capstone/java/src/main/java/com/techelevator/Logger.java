package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger 
{
	 
	 public void logMessage(String message)
	 {
	 	 String fileName = "log.txt";
	     File logFile = new File(fileName);

	     String currentTime = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);

	     // open the log file to append 
	     try(FileOutputStream outputStream = new FileOutputStream(logFile, true);
	         PrintWriter writer = new PrintWriter(outputStream);)
	     {
	         String line = String.format("%s %s", currentTime, message);
	         writer.println(line);
	     }
	     catch(Exception ex)
	     {
	         //swallow
	     }
	 }
}
