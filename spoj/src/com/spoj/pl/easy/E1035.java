package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1035 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(reader.readLine());
		int previousNumber = 0;
		int counter = 0;
		
		System.out.println(number);
		
		while(counter < 3) {
			previousNumber = number;
			number = Integer.parseInt(reader.readLine());
			
			if(number == 42 && previousNumber != 42)
				counter++;
			
			System.out.println(number);
		}
	}
}
