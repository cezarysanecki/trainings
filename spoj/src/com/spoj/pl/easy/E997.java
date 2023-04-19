package com.spoj.pl.easy;

import java.util.Scanner;

public class E997 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String[] passedData = scanner.nextLine().split(" ");
						
			char sign = passedData[0].charAt(0);
			int firstNumber = Integer.valueOf(passedData[1]);
			int secondNumber = Integer.valueOf(passedData[2]);
			
			switch(sign) {
				case '+':
					System.out.println(firstNumber + secondNumber);
					break;
				case '-':
					System.out.println(firstNumber - secondNumber);
					break;
				case '*':
					System.out.println(firstNumber * secondNumber);
					break;
				case '/':
					System.out.println(firstNumber / secondNumber);
					break;
				case '%':
					System.out.println(firstNumber % secondNumber);
					break;
				default:
					throw new Exception("Unsupported sign");
			}
		}
		
		scanner.close();
	}
}
