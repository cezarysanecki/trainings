package com.spoj.pl.easy;

import java.util.Scanner;

public class E496 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		
		for(int i = 1; i <= numberOfTests; i++) {
			int numberToTest = scanner.nextInt();
			
			System.out.println(getUnitsAndTensOfFactorial(numberToTest));
		}
		
		scanner.close();
	}
	
	static String getUnitsAndTensOfFactorial(int n) {
		if(n == 0 || n == 1)
			return "0 1";
		else if(n >= 10)
			return "0 0";
		else {
			int factorial = 1;
			
			for(int i = 2; i <= n; i++) {
				factorial *= i;
				
				if(factorial >= 100) {
					factorial = factorial % 100;
				}
			}
			
			String numberWithTwoPaddingZeros = String.format("%02d" , factorial);
						
			String units = numberWithTwoPaddingZeros.substring(numberWithTwoPaddingZeros.length() - 1);
			String tens = numberWithTwoPaddingZeros.substring(numberWithTwoPaddingZeros.length() - 2, numberWithTwoPaddingZeros.length() - 1);
			
			return tens + " " + units;
		}
	}
}
