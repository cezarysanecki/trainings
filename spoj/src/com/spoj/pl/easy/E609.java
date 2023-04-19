package com.spoj.pl.easy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class E609 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String numbersToTest = scanner.nextLine();
					
		StringTokenizer tokenizer = new StringTokenizer(numbersToTest, " ");
					
		double[] numbersFromString = new double[2];
		
		for(int j = 0; j < numbersFromString.length; j++) {
			numbersFromString[j] = Double.valueOf((String) tokenizer.nextElement());
		}
		
		showAreaOfCrossingCircle(numbersFromString[0], numbersFromString[1]);
		
		scanner.close();
	}
	
	static void showAreaOfCrossingCircle(double r, double d) {
		double x = getXOfCrossing(d);
		double y = getRadiusOfCreatedCircle(r, x);
		double area = getAreaOfCrossingCircle(y);
		
		System.out.println(area);
	}
	
	static double getXOfCrossing(double d) {
		return d/2;
	}
	
	static double getRadiusOfCreatedCircle(double r, double x) {
		return Math.sqrt(r * r - x * x);
	}
	
	static double getAreaOfCrossingCircle(double y) {
		return Math.round(Math.PI * y * y * 100.0) / 100.0;
	}
}
