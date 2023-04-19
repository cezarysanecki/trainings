package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1042 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dimensionsOfMatrix = reader.readLine().split(" ");
		int rows = Integer.valueOf(dimensionsOfMatrix[0]);
		int columns = Integer.valueOf(dimensionsOfMatrix[1]);
		
		String[][] matrix = new String[rows][columns];
		
		for(int i = 0; i < rows; i++) {
			String[] rowValues = reader.readLine().split(" ");
			
			for(int j = 0; j < columns; j++) {
				matrix[i][j] = rowValues[j];
			}
		}
		
		String[][] reversedMatrix = new String[columns][rows];
		
		for(int i = 0; i < columns; i++) {			
			for(int j = 0; j < rows; j++) {
				reversedMatrix[i][j] = matrix[j][i];
			}
			
			System.out.println(String.join(" ", reversedMatrix[i]));
		}
	}
}
