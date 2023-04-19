package com.spoj.pl.easy;

import java.util.Scanner;

public class E619 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i <= numberOfTests; i++) {
			String numberToTest = scanner.nextLine();
			numberToTest = numberToTest.replace(',', '.');
			
			printfloat(Float.valueOf(numberToTest));
		}
		
		scanner.close();
	}
	
	static void printfloat(float number) {
		String hexToShow;
		
		if(number == 0) {
			hexToShow = "0 0 0 0";
		} else {
			int intBits = Float.floatToIntBits(number);
			String hexRep = Integer.toHexString(intBits);
					
			StringBuilder builder = new StringBuilder();
			
			for(int i = 0; i < 4; i++) {
				String twoBytes = hexRep.substring(2 * i, 2 * i + 2);
				
				if(twoBytes.equals("00"))
					builder.append("0");
				else if (twoBytes.startsWith("0"))
					builder.append(twoBytes.substring(1));
				else
					builder.append(twoBytes);
				
				if(i != 3)
					builder.append(' ');
			}
			
			hexToShow = builder.toString();
		}
		
		System.out.println(hexToShow);
	}
}
