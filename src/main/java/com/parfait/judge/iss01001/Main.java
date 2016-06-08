package com.parfait.judge.iss01001;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String input = scanner.nextLine();
		String[] inputs = input.split(" ");

		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);

		System.out.println(a - b);
	}
}
