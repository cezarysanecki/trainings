package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class E723 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			String[] passedData = reader.readLine().split(" ");
			
			String[] numbersToMove = new String[Integer.valueOf(passedData[0])];
			
			for(int j = 1; j < passedData.length; j++) {
				numbersToMove[j - 1] = passedData[j];
			}
			
			String numberToMove = numbersToMove[0];
			
			for(int j = 1; j < numbersToMove.length; j++) {
				numbersToMove[j - 1] = numbersToMove[j];
			}
			
			numbersToMove[numbersToMove.length - 1] = numberToMove;
			
			List<String> listOfNumbers = Arrays.asList(numbersToMove);
			
			System.out.println(String.join(" ", listOfNumbers));
		}
	}
}
