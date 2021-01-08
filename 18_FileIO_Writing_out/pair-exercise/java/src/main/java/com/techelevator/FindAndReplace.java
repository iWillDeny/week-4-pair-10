package com.techelevator;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {

		//the source file to use
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the file name you'd like to edit: ");
		String fileName = userInput.nextLine();
		
		
		//ask the user for the word to replace the search word with
		System.out.println("What word would you like to replace in the file?");
		String wordToReplace = userInput.nextLine();
		
		//ask the user for the search word
		System.out.println("What word would you like to add to the file?");
		String wordToInsert = userInput.nextLine();
		
		//the destination file
		System.out.println("What would you like to name the new file?");
		String outputFile = userInput.nextLine();
		
		createNewFile(fileName, outputFile, wordToReplace, wordToInsert);
	}
	
		//write a method to check if the file exists
		public static void createNewFile(String fileToCheck, String outFileName, String wordToReplace, String replacedWord)
		{
			File newFile = new File(fileToCheck);
			File outFile = new File(outFileName);
			
			try(
				Scanner inStream = new Scanner(newFile);
				FileOutputStream fileStream = new FileOutputStream(outFile, true);
				BufferedOutputStream fileBuffer = new BufferedOutputStream(fileStream);
				PrintStream dataOutput = new PrintStream(fileBuffer);	
				)
				
			{
				System.out.println("Found " + fileToCheck);
				while(inStream.hasNextLine())
				{
					String lineToCheck = inStream.nextLine();
					if(lineToCheck.contains(wordToReplace))
							
					{
						String outputString = lineToCheck.replaceAll(wordToReplace, replacedWord);
						
						dataOutput.println(outputString);
					}
					else if(lineToCheck.contains(wordToReplace.toUpperCase()))
							{
								String outputString = lineToCheck.replaceAll(wordToReplace.toUpperCase(), replacedWord);
						
								dataOutput.println(outputString);
							}
					else if(lineToCheck.contains(wordToReplace.toLowerCase()))
					{
						String outputString = lineToCheck.replaceAll(wordToReplace, replacedWord);
						
						dataOutput.println(outputString);
					}
					else
					{
						dataOutput.println(lineToCheck);
					}
				}
				dataOutput.flush();
				dataOutput.close();
			}
			catch(Exception e)	
			{
				System.out.println("The file does not exist.");
			}
		}
	
}
