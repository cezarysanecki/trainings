package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E626 {
	public static void main(String[] args) throws IOException {		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			int secondInOneDay = 86400;
			
			String[] data = reader.readLine().split(" ");
			
			int numberOfGluttons = Integer.valueOf(data[0]);
			int piesInOneBox =  Integer.valueOf(data[1]);
			
			double sum = 0;
			
			for(int j = 0; j < numberOfGluttons; j++) {
				sum += secondInOneDay / Integer.parseInt(reader.readLine());
			}
			
			System.out.println((int) Math.ceil(sum / piesInOneBox));
		}
		
		reader.close();
	}
}
