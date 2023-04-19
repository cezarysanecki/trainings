package com.spoj.pl.easy;

import java.util.Scanner;

public class E438 {
	static final String IS_PRIME = "TAK";
	static final String IS_NOT_PRIME = "NIE";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		
		for(int i = 1; i <= numberOfTests; i++) {
			int numberToCheck = scanner.nextInt();
			
			System.out.println(isPrime(numberToCheck));
		}
		
		scanner.close();
	}
	
	static String isPrime(int x) {
		if(x == 1)
			return IS_NOT_PRIME;
		
		for(int i = 2; i * i <= x; i++) {
			if(x % i == 0)
				return IS_NOT_PRIME;
		}
		
		return IS_PRIME;
	}
}
