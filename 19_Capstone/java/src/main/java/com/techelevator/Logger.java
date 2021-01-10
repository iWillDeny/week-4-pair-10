package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.channels.FileChannel.MapMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
}
