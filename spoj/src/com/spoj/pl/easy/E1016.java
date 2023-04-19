package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1016 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			String[] passedVelocities = reader.readLine().split(" ");
			
			int va = Integer.valueOf(passedVelocities[0]);
			int vb = Integer.valueOf(passedVelocities[1]);
			
			System.out.println(2 * va * vb / (va + vb));
		}
	}
}
