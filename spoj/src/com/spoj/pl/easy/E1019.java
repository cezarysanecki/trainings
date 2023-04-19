package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1019 {
	static char[] hexes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	static char[] elevens = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A'};	
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			int decimalNumber = Integer.valueOf(reader.readLine());
			
			System.out.println(convertToHex(decimalNumber) + " " + convertToElevens(decimalNumber));
		}
	}
	
	static String convertToHex(int decimal) {
		StringBuilder builder = new StringBuilder();
		
		while(decimal > 15) {
			int rest = decimal % 16;
			decimal = decimal / 16;
			
			builder.append(hexes[rest]);
		}
		
		builder.append(hexes[decimal]);
		builder.reverse();
		
		return builder.toString();
	}
	
	static String convertToElevens(int decimal) {
		StringBuilder builder = new StringBuilder();
		
		while(decimal > 10) {
			int rest = decimal % 11;
			decimal = decimal / 11;
			
			builder.append(elevens[rest]);
		}
		
		builder.append(elevens[decimal]);
		builder.reverse();
		
		return builder.toString();
	}
}
