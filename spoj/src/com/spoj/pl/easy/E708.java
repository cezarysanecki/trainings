package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E708 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			int passedValue = Integer.parseInt(reader.readLine());
			
			showIndexOfExpressionEqualsOne(passedValue);
		}
	}

	static void showIndexOfExpressionEqualsOne(int passedValue) {
		int index = 0;
		
		while(passedValue != 1) {
			if(passedValue % 2 == 0) {
				passedValue /= 2;
			} else {
				passedValue = 3 * passedValue + 1;
			}
			
			index++;
		}
		
		System.out.println(index);
	}
}
