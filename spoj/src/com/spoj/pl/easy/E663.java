package com.spoj.pl.easy;

import java.util.Arrays;
import java.util.Scanner;

public class E663 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		
		for(int i = 1; i <= numberOfTests; i++) {
			int numberOfPoints = scanner.nextInt();
			scanner.nextLine();
				
			Point[] points = new Point[numberOfPoints];
				
			for(int j = 0; j < numberOfPoints; j++) {
				String[] dataOfPoint = scanner.nextLine().split(" ");
				
				points[j] = new Point(dataOfPoint[0], Integer.parseInt(dataOfPoint[1]), Integer.parseInt(dataOfPoint[2]));
			}
				
			Arrays.sort(points);
				
			for(Point point : points) {
				System.out.println(point.toString());
			}
		}
			
		scanner.close();
	}
	
	static class Point implements Comparable<Point> {
		String name;
		int x;
		int y;
		double distanceFromBeginOfAxis;
		
		public Point(String name, int x, int y) {
			super();
			this.name = name;
			this.x = x;
			this.y = y;
			this.distanceFromBeginOfAxis = Math.sqrt(x * x + y * y);
		}

		@Override
		public int compareTo(Point point) {
			return Double.compare(this.distanceFromBeginOfAxis, point.distanceFromBeginOfAxis);
		}
		
		@Override
		public String toString() {
			return name + " " + x + " " + y;
		}
		
		public String getName() {
			return name;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
		
		public double getDistanceFromBeginOfAxis() {
			return distanceFromBeginOfAxis;
		}
	}
}
