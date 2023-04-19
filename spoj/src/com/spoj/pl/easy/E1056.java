package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1056 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTests = Integer.parseInt(reader.readLine());
		
		for(int i = 1; i <= numberOfTests; i++) {
			String[] dimensionsOfMatrix = reader.readLine().split(" ");
			int rows = Integer.valueOf(dimensionsOfMatrix[0]);
			int columns = Integer.valueOf(dimensionsOfMatrix[1]);
			
			String[][] matrix = new String[rows][columns];
			
			for(int j = 0; j < rows; j++) {
				String[] rowValues = reader.readLine().split(" ");
				
				for(int k = 0; k < columns; k++) {
					matrix[j][k] = rowValues[k];
				}
			}
			
			String topLeft = matrix[0][0];
			
			for(int j = 1; j < columns; j++) {
				matrix[0][j - 1] = matrix[0][j];
			}
			
			String bottomRigth = matrix[rows - 1][columns - 1];
			
			for(int j = columns - 2; j >= 0; j--) {
				matrix[rows - 1][j + 1] = matrix[rows - 1][j];
			}
			
			for(int j = rows - 1; j > 0; j--) {
				matrix[j][0] = matrix[j - 1][0];
			}
			
			matrix[1][0] = topLeft;
			
			for(int j = 0; j < rows - 2; j++) {
				matrix[j][columns - 1] = matrix[j + 1][columns - 1];
			}
			
			matrix[rows - 2][columns - 1] = bottomRigth;
			
			for(int j = 0; j < rows; j++) {
				System.out.println(String.join(" ", matrix[j]));
			}
		}
	}
}
