package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {

		String filePath = "alices_adventures_in_wonderland.txt";
		File theFile = new File(filePath);
		
		Scanner input = new Scanner(theFile);
		int count = 0;
		int sentenceCount = 0;
		String theLine;
		while(input.hasNextLine())
		{
			theLine = input.nextLine();

			String[] words = theLine.split(" ");
			count += words.length;
			String[] charToCount = theLine.split("");
			for(String letter: charToCount)
			{
				if(letter.equals("."))
				{
					sentenceCount+=1;
				}
			}
		}
		
		System.out.println("Word Count: " + count + " Sentence Count: " + sentenceCount);
		
		input.close();
		
	}

}

