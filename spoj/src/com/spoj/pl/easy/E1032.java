package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class E1032 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			String[] passedData = reader.readLine().split(" ");
			
			int max = Integer.valueOf(passedData[0]);
			int firstNumber = Integer.valueOf(passedData[1]);
			int secondNumber = Integer.valueOf(passedData[2]);
			
			List<String> iterationNumbers = new LinkedList<>(); 
			int iterationNumber = firstNumber;
			
			while(iterationNumber < max) {
				if(iterationNumber % secondNumber != 0)
					iterationNumbers.add(String.valueOf(iterationNumber));
				
				iterationNumber += firstNumber;
			}
			
			String listOfNumbers = String.join(" ", iterationNumbers);
			System.out.println(listOfNumbers);
		}
	}
}
