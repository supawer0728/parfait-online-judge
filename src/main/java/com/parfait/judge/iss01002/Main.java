package com.parfait.judge.iss01002;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int repeat = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < repeat; i++) {
			printCountOfPossibleSite();
		}
	}

	private static void printCountOfPossibleSite() {

		String[] inputs = scanner.nextLine().split(" ");

		Point p1 = new Point(inputs[0], inputs[1], inputs[2]);
		Point p2 = new Point(inputs[3], inputs[4], inputs[5]);

		System.out.println(calculate(p1, p2));
	}

	public static int calculate(Point p1, Point p2) {

		double distanceOfPoints = getDistanceOfPoint(p1, p2);

		if (distanceOfPoints == 0) {
			if (p1.r == p2.r) {
				return -1;
			} else {
				return 0;
			}
		} else {
			if (p1.r + p2.r == distanceOfPoints) {
				return 1;
			} else if (p1.r + p2.r > distanceOfPoints) {
				return 2;
			} else {
				return 0;
			}
		}
	}

	private static double getDistanceOfPoint(Point p1, Point p2) {

		int width = Math.abs(p1.x - p2.x);
		int height = Math.abs(p1.y - p2.y);
		double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

		return hypotenuse;
	}

	static class Point {
		int x;
		int y;
		int r;

		Point(String x, String y, String r) {
			this.x = Integer.parseInt(x);
			this.y = Integer.parseInt(y);
			this.r = Integer.parseInt(r);
		}
	}
}
