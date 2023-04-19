package com.spoj.pl.easy;

import java.util.Scanner;

public class E998 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int[] memory = new int[10];
		
		while(scanner.hasNext()) {
			String[] passedData = scanner.nextLine().split(" ");
						
			char sign = passedData[0].charAt(0);
			int firstNumber = Integer.valueOf(passedData[1]);
			int secondNumber = Integer.valueOf(passedData[2]);
			
			switch(sign) {
				case 'z':
					memory[firstNumber] = secondNumber;
					break;
				case '+':
					System.out.println(memory[firstNumber] + memory[secondNumber]);
					break;
				case '-':
					System.out.println(memory[firstNumber] - memory[secondNumber]);
					break;
				case '*':
					System.out.println(memory[firstNumber] * memory[secondNumber]);
					break;
				case '/':
					System.out.println(memory[firstNumber] / memory[secondNumber]);
					break;
				case '%':
					System.out.println(memory[firstNumber] % memory[secondNumber]);
					break;
				default:
					throw new Exception("Unsupported sign");
			}
		}
		
		scanner.close();
	}
}
