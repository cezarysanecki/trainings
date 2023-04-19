package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1102 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			String[] passedData = reader.readLine().split(" ");
			
			int size = Integer.valueOf(passedData[0]);
			int[] numbers = new int[size];
			
			double sum = 0;
			
			for (int j = 0; j < numbers.length; j++) {
				numbers[j] = Integer.valueOf(passedData[j + 1]);
				sum += numbers[j];
			}
			
			double avarage = sum / size;
			int closestNumber = 0;
			
			for (int j = 0; j < numbers.length; j++) {
				if(Math.abs(avarage - closestNumber) > Math.abs(avarage - numbers[j]))
					closestNumber = numbers[j];
			}
			
			System.out.println(closestNumber);
		}
	}
}
