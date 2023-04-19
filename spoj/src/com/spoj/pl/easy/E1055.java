package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1055 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			String[] passedData = reader.readLine().split(" ");
						
			int numberOfNumbers = Integer.valueOf(passedData[0]);
			
			String[] orderedNumbers = new String[numberOfNumbers];
						
			for(int j = 1; j <= numberOfNumbers; j++) {				
				if(j % 2 == 0) {
					orderedNumbers[(j - 1) / 2] = passedData[j];
				} else {
					orderedNumbers[numberOfNumbers / 2 + (j - 1) / 2] = passedData[j];
				}
			}

			String sortedString = String.join(" ", orderedNumbers);
			
			System.out.println(sortedString);
		}
	}
}
