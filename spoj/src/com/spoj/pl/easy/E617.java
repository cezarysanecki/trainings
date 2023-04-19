package com.spoj.pl.easy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class E617 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i <= numberOfTests; i++) {
			String numbersToTest = scanner.nextLine();
						
			StringTokenizer tokenizer = new StringTokenizer(numbersToTest, " ");
			
			String word1 = (String) tokenizer.nextElement();
			String word2 = (String) tokenizer.nextElement();
			
			System.out.println(createNewWord(word1.toCharArray(), word2.toCharArray()));
		}
		
		scanner.close();
	}
	
	static String createNewWord(char[] word1, char[] word2) {
		StringBuilder builder = new StringBuilder();
		
		if(word1.length < word2.length) {
			for(int i = 0; i < word1.length; i++) {
				builder.append(word1[i]).append(word2[i]);
			}
		} else {
			for(int i = 0; i < word2.length; i++) {
				builder.append(word1[i]).append(word2[i]);
			}
		}
		
		return builder.toString();
	}
}
