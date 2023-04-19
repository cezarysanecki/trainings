package com.spoj.pl.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class E522 {
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
			
			System.out.println(getSuitableNumberOfSweets(numbers[0], numbers[1]));
		}
		
		scanner.close();
	}
	
	static int getSuitableNumberOfSweets(int firstGroup, int secondGroup) {
		List<Integer> firstDividors = getAllDividors(firstGroup);
		List<Integer> secondDividors = getAllDividors(secondGroup);
		
		List<Integer> componentsOfNumber = new ArrayList<>();
		
		if(firstDividors.size() > secondDividors.size()) {
			for(Integer number : firstDividors) {
				if(secondDividors.contains(number))
					secondDividors.remove(number);
				
				componentsOfNumber.add(number);
			}
			
			componentsOfNumber.addAll(secondDividors);
		} else {
			for(Integer number : secondDividors) {
				if(firstDividors.contains(number))
					firstDividors.remove(number);
				
				componentsOfNumber.add(number);
			}

			componentsOfNumber.addAll(firstDividors);
		}
		
		int multiply = 1;
		
		for(Integer number : componentsOfNumber) {
			multiply *= number;
		}
		
		return multiply;
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
