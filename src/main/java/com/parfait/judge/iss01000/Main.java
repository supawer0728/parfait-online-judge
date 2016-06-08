package com.parfait.judge.iss01000;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String input = scanner.nextLine();
		int[] intArray = splitToIntArray(input);
		int sumOfArray = getSumOfArray(intArray);
		System.out.println(sumOfArray);
	}

	private static int[] splitToIntArray(String numbers) {

		String[] stringElements = numbers.split(" ");

		int[] intArray = parseStringArrayToIntArray(stringElements);

		return intArray;
	}

	private static int[] parseStringArrayToIntArray(String[] stringArray) {

		if (stringArray == null || stringArray.length < 1) {
			throw new IllegalArgumentException(stringArray + " is invalid argument!");
		}

		int size = stringArray.length;

		int[] intArray = new int[size];
		for (int i = 0; i < size; i++) {
			intArray[i] = Integer.parseInt(stringArray[i]);
		}

		return intArray;
	}

	private static int getSumOfArray(int[] array) {

		int sum = 0;

		for (int number : array) {
			sum += number;
		}

		return sum;
	}
}
