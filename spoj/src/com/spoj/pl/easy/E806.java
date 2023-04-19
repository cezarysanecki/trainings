package com.spoj.pl.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E806 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sizeOfWindmill = Integer.parseInt(reader.readLine());
		
		while(sizeOfWindmill != 0) {
			Windmill windmill = null;
			
			if (sizeOfWindmill > 0) {
				windmill = new Windmill(sizeOfWindmill);
				windmill.buildLeftWindMill();
			} else {
				windmill = new Windmill(-sizeOfWindmill);
				windmill.buildRightWindMill();
			}
			
			windmill.showWindmill();
			
			sizeOfWindmill = Integer.parseInt(reader.readLine());
		}
	}
	
	static class Windmill {
		int size;
		char[][] image;
		
		public Windmill(int size) {
			super();
			this.size = size;
			this.image = new char[2 * size][2 * size];
			
			initialize();
		}
		
		private void initialize() {
			for(int i = 0; i < 2 * size; i++) {
				this.image[i][i] = '*';
				this.image[2 * size - 1 - i][i] = '*';
			}
		}
		
		void buildRightWindMill() {
			for(int i = 0; i < size - 1; i++) {				
				for(int j = i + 1; j < 2 * size - (i + 1); j++) {
					if(j < size) {
						this.image[i][j] = '*';
						this.image[j][i] = '.';
						this.image[2 * size - i - 1][j] = '.';
						this.image[j][2 * size - i - 1] = '*';
					} else {
						this.image[i][j] = '.';
						this.image[j][i] = '*';
						this.image[2 * size - i - 1][j] = '*';
						this.image[j][2 * size - i - 1] = '.';
					}	
				}
			}
		}
		
		void buildLeftWindMill() {
			for(int i = 0; i < size - 1; i++) {				
				for(int j = i + 1; j < 2 * size - (i + 1); j++) {
					if(j < size) {
						this.image[i][j] = '.';
						this.image[j][i] = '*';
						this.image[2 * size - i - 1][j] = '*';
						this.image[j][2 * size - i - 1] = '.';
					} else {
						this.image[i][j] = '*';
						this.image[j][i] = '.';
						this.image[2 * size - i - 1][j] = '.';
						this.image[j][2 * size - i - 1] = '*';
					}	
				}
			}
		}

		public void showWindmill() {
			StringBuilder builder = new StringBuilder();
			
			for(int i = 0; i < 2 * size; i++) {
				for(int j = 0; j < 2 * size; j++) {
					builder.append(this.image[i][j]);
				}
				
				builder.append('\n');
			}
			
			System.out.println(builder.toString());
		}
	}
}
