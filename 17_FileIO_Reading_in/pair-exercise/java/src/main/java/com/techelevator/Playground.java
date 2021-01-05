package com.techelevator;


import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Playground {

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

			String[] words = theLine.split("\\s+");
			count += words.length;
			String[] charToCount = theLine.split("");
			for(String word: words)
			{
				if(word.endsWith(".") || word.endsWith("?") || word.endsWith("!"))
				{
					sentenceCount+=1;
				}
			}
		}
		
		System.out.println("Word Count: " + count + " Sentence Count: " + sentenceCount);
		
		input.close();
		
	}

}

