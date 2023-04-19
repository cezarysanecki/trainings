package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E675 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			int numberOfInstructions = Integer.parseInt(reader.readLine());
			
			int direction, steps, X = 0, Y = 0;
			
			for(int j = 1; j <= numberOfInstructions; j++) {
				String[] hintToTreasure = reader.readLine().split(" ");			
				direction = Integer.parseInt(hintToTreasure[0]);		
				steps = Integer.parseInt(hintToTreasure[1]);
								
				switch(direction) {
					case 0:
						Y += steps;
						break;
					case 1:
						Y -= steps;
						break;
					case 2:
						X += steps;
						break;
					case 3:
						X -= steps;
						break;
					default:
						throw new Exception("Insterted direction is out of range");
				}
			}
			
			if(X == 0 && Y == 0) {
				System.out.println("studnia");
			} else if(X == 0) {
				if(Y > 0) {
					System.out.println("0 " + Y);
				} else {
					System.out.println("1 " + (-Y));
				}
			} else if(Y == 0) {
				if(X > 0) {
					System.out.println("2 " + X);
				} else {
					System.out.println("3 " + (-X));
				}
			} else {
				if(X > 0) {
					if(Y > 0) {
						System.out.println("0 " + Y);
						System.out.println("2 " + X);
					} else {
						System.out.println("1 " + (-Y));
						System.out.println("2 " + X);
					}
				} else {
					if(Y > 0) {
						System.out.println("0 " + Y);
						System.out.println("3 " + (-X));
					} else {
						System.out.println("1 " + (-Y));
						System.out.println("3 " + (-X));
					}
				}
			}
		}
		
		reader.close();
	}
}
