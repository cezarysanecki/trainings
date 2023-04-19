package com.spoj.pl.easy;

import java.util.Scanner;

public class E969 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String[] dataOfQuadraticEquation = scanner.nextLine().split(" ");
			
			double a = Double.valueOf(dataOfQuadraticEquation[0]);
			double b = Double.valueOf(dataOfQuadraticEquation[1]);
			double c = Double.valueOf(dataOfQuadraticEquation[2]);
			
			System.out.println(calculateNumberOfRoots(a, b, c));
		}
		
		scanner.close();
	}
	
	static int calculateNumberOfRoots(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		
		if(delta > 0)
			return 2;
		else if(delta == 0)
			return 1;
		else
			return 0;
	}
}
