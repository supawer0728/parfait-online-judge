package com.parfait.judge.iss010998;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String input = scanner.nextLine();
		String[] inputs = input.split(" ");

		System.out.println(parseAndMultiple(inputs[0], inputs[1], (a, b) -> Integer.parseInt(a) * Integer.parseInt(b)));
	}

	interface ParseAndMultiple {
		int parseAndMultiple(String a, String b);
	}

	private static int parseAndMultiple(String a, String b, ParseAndMultiple pam) {
		return pam.parseAndMultiple(a, b);
	}
}
