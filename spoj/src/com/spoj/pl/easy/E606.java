package com.spoj.pl.easy;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class E606 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i <= numberOfTests; i++) {
			String numbersToTest = scanner.nextLine();
						
			StringTokenizer tokenizer = new StringTokenizer(numbersToTest, " ");
			
			int size = Integer.valueOf((String) tokenizer.nextElement());
			
			int[] numbersFromString = new int[size];
			
			for(int j = numbersFromString.length - 1; j >= 0; j--) {
				numbersFromString[j] = Integer.valueOf((String) tokenizer.nextElement());
			}
			
			showElementsDelimited(numbersFromString, " ");
		}
		
		scanner.close();
	}
	
	static void showElementsDelimited(int[] array, String delimiter) {
		StringJoiner joiner = new StringJoiner(delimiter);
		
		for(int element : array)
			joiner.add(String.valueOf(element));
		
		System.out.println(joiner.toString());
	}
}
