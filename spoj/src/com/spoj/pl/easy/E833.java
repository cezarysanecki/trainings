package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E833 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			String[] passedData = reader.readLine().split(" ");
			
			int a = Integer.valueOf(passedData[0]);
			int b = Integer.valueOf(passedData[1]);
						
			System.out.println(shortenedFactorial(a, b));
		}
	}
	
	static int shortenedFactorial(int a, int b) {
		double result = 1;
		
		if(b > a - b) {
			b = a - b;
		}
		
		for(int i = a; i > b; i--) {
			result *= 1.0 * i / (a - i + 1);
		}

		return (int) Math.round(result);
	}
}
