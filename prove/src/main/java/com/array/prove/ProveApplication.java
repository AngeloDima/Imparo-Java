package com.array.prove;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProveApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] città = new String[3];
		System.out.println("Inserisci 3 città");
		for (int i = 0; i < città.length; i++) {
			String nome = scanner.nextLine();
			città[i] = (i + 1) + ", " + nome;

		}
		System.out.println("---------------");
		System.out.println("---------------");
		for (int j = 0; j < città.length; j++) {
			System.out.println(città[j]);
		}

	}

}
