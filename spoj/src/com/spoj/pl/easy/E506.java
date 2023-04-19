package com.spoj.pl.easy;

import java.util.Scanner;

public class E506 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i <= numberOfTests; i++) {
			String wordToTest = scanner.next();
			
			System.out.println(getShortenedWord(wordToTest));
		}
		
		scanner.close();
	}
	
	static String getShortenedWord(String word) {
		char[] charactersOfWord = word.toCharArray();
		char actualCharacter = charactersOfWord[0];
		StringBuilder shortendedWordBuilder = new StringBuilder();
		int counterOfRepeatedCharacter = 1;
		
		for(int i = 1; i < charactersOfWord.length; i++) {
			if(actualCharacter == charactersOfWord[i]) {
				counterOfRepeatedCharacter++;
			} else {
				shortendedWordBuilder.append(partOfWordToAppend(actualCharacter, counterOfRepeatedCharacter));
				
				actualCharacter = charactersOfWord[i];
				counterOfRepeatedCharacter = 1;
			}
		}
		
		shortendedWordBuilder.append(partOfWordToAppend(actualCharacter, counterOfRepeatedCharacter));
		
		return shortendedWordBuilder.toString();
	}
	
	static public String partOfWordToAppend(char character, int counter) {
		if(counter == 1) {
			return "" + character;
		} else if (counter == 2) {
			return "" + character + character;
		} else {
			return "" + character + counter;
		}
	}
}
