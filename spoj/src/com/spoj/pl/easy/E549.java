package com.spoj.pl.easy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class E549 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		
		for(int i = 1; i <= numberOfTests; i++) {
			int numbersToAdd = scanner.nextInt();
			scanner.nextLine();

			String numbersToTest = scanner.nextLine();
			
			StringTokenizer tokenizer = new StringTokenizer(numbersToTest, " ");
			
			int[] numbers = new int[numbersToAdd];
			
			for(int j = 0; j < numbers.length; j++) {
				numbers[j] = Integer.valueOf((String) tokenizer.nextElement());
			}
			
			System.out.println(addAllNumbers(numbers));
		}
		
		scanner.close();
	}
	
	static int addAllNumbers(int[] numbers) {
		int sum = 0;
		
		for(int number : numbers)
			sum += number;
		
		return sum;
	}
}
