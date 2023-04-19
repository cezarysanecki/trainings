package com.spoj.pl.easy;

import java.util.Scanner;

public class E568 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		
		for(int i = 1; i <= numberOfTests; i++) {
			int typedNumber = scanner.nextInt();
			
			int counter = 0;
			
			while(!checkIfNumberIsPalidrom(typedNumber)) {
				typedNumber = addNumberAndItsRevision(typedNumber);
				counter++;
			}
			
			System.out.println(typedNumber + " " + counter);
		}
		
		scanner.close();
	}
	
	static boolean checkIfNumberIsPalidrom(int number) {
		int revarsedNumber = getRevarsedNumber(number);
		
		if(number == revarsedNumber)
			return true;
		
		return false;
	}
	
	static int getRevarsedNumber(int number) {
		String leftToRight = String.valueOf(number);
		StringBuilder builder = new StringBuilder();
		for(int i = leftToRight.length() - 1; i >= 0; i--) {
			builder.append(leftToRight.charAt(i));
		}
		
		return Integer.valueOf(builder.toString());
	}
	
	static int addNumberAndItsRevision(int number) {
		return number + getRevarsedNumber(number);
	}
}
