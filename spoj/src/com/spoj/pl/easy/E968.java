package com.spoj.pl.easy;

import java.io.IOException;
import java.util.Scanner;

public class E968 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		
		while(scanner.hasNext()) {
			int numberToAdd = scanner.nextInt();
			
			result += numberToAdd;
			
			System.out.println(result);
		}
		
		scanner.close();
	}
}
