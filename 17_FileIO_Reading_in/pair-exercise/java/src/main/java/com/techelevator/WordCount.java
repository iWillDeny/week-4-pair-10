package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException  {
		
		//initialize and word and sentence count
		int wordCount = 0;
		int sentenceCount = 0;
		
		//point to the file's location
		//String sentenceData = "alices_adventures_in_wonderland.txt";
		
		//create a new file object
		File newFile = new File("alices_adventures_in_wonderland.txt");
		
		//create a scanner
		Scanner scanner = new Scanner(newFile);
		
		//create a string that will hold the sentence that we read in
		String tempLine = " ";
		
		//loop over the file line by line until there are no more lines
		while(scanner.hasNext())
		{

			tempLine = scanner.next();
			
			
			//count the number of words in the line
			wordCount++;
			
			//split apart the line into individual characters by the lack of white space
			if(tempLine.endsWith(".") || tempLine.endsWith("!") || tempLine.endsWith("?"))
			{
				sentenceCount++;
			}
			
		
		}
		//return the word and sentence count
				System.out.println("Word Count: " + wordCount);
				System.out.println("Sentence Count: " + sentenceCount);
	}

}
