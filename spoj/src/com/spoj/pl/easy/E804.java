package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E804 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			String[] passedData = reader.readLine().split(" ");
			
			int firstPlayer = Integer.valueOf(passedData[0]);
			int secondPlayer = Integer.valueOf(passedData[1]);
			
			while(firstPlayer != secondPlayer) {
				if(firstPlayer > secondPlayer) {
					firstPlayer -= secondPlayer;
				} else {
					secondPlayer -= firstPlayer;
				}
			}
			
			System.out.println(firstPlayer + secondPlayer);
		}
	}
}
