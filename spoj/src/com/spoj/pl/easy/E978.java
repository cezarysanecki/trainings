package com.spoj.pl.easy;

import java.util.Scanner;

public class E978 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] heap = new String[10];
		int head = 0;
		
		while(scanner.hasNext()) {
			String signToHeap = scanner.nextLine();
						
			if(signToHeap.equals("+")) {
				String number = scanner.nextLine();
				
				if(head == 10) {
					System.out.println(":(");
					continue;
				}
					
				heap[head++] = number;
				System.out.println(":)");
			} else {
				if(head == 0) {
					System.out.println(":(");
					continue;
				}
					
				System.out.println(heap[--head]);
			}
		}
		
		scanner.close();
	}
}
