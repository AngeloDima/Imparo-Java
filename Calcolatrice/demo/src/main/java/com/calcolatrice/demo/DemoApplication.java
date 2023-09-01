package com.calcolatrice.demo;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double a, b;

		System.out.println("scelti il primo numero");
		a = scanner.nextDouble();
		System.out.println("scegli un operatore");
		char operator = scanner.next().charAt(0);
		System.out.println("scelti il secondo numero");
		b = scanner.nextDouble();

		double result = 0;

		if (operator == '+') {
			result = a + b;
		}

		if (operator == '-') {
			result = a - b;
		}

		if (operator == '*') {
			result = a * b;
		}

		if (operator == '/') {
			result = a / b;
		}

		System.out.println("risultato" + result);

		scanner.close();

	}
}
