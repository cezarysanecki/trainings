package com.spoj.pl.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class E601 {
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
			
			System.out.println(nwd(numbers[0], numbers[1]));
		}
		
		scanner.close();
	}
	
	static int nwd(int a, int b) {
		List<Integer> allDivirodsOfA = getAllDividors(a);
		List<Integer> allDivirodsOfB = getAllDividors(b);
		
		int nwd = 1;
		
		for(Integer number : allDivirodsOfA) {
			if(allDivirodsOfB.contains(number)) {
				allDivirodsOfB.remove(number);
				
				nwd *= number;
			}
				
		}
		
		return nwd;
	}
	
	static List<Integer> getAllDividors(int number) {
		List<Integer> dividors = new ArrayList<Integer>();
		
		while(number != 1) {
			int dividor = getFirstDividor(number);
			number /= dividor;
			
			dividors.add(dividor);
		}
		
		return dividors;
	}
	
	static int getFirstDividor(int number) {
		for(int i = 2; i * i <= number; i++) {
			if(number % i == 0)
				return i;
		}
		
		return number;
	}
}
