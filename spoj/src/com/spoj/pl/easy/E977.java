package com.spoj.pl.easy;

import java.util.Scanner;

public class E977 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String[] dataOfQuadraticEquation = scanner.nextLine().split(" ");
						
			revarseArrayAndShow(dataOfQuadraticEquation);
		}
		
		scanner.close();
	}
	
	static void revarseArrayAndShow(String[] array) {
		for(int i = 0; i < array.length / 2; i++) {
			String temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		
		System.out.println(String.join(" ", array));
	}
}
