package com.spoj.pl.easy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class E499 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i <= numberOfTests; i++) {
			String numbersToTest = scanner.nextLine();
						
			StringTokenizer tokenizer = new StringTokenizer(numbersToTest, " ");
			
			int[] numbers = new int[2];
			
			for(int j = 0; j < numbers.length; j++) {
				numbers[j] = Integer.valueOf((String) tokenizer.nextElement());
			}
			
			System.out.println(getLastDigitOfPowerAtoB(numbers[0], numbers[1]));
		}
		
		scanner.close();
	}
	
	static int getLastDigitOfPowerAtoB(int a, int b) {
		int power = b % 4;
		
		if(power == 0)
			power = 4;
		
		return ((int) (Math.pow(a % 10, power))) % 10;
	}
}
