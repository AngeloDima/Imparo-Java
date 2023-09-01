package com.contalettere.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		String a;

		System.out.println("inserisci una parola da contare: ");
		a = scanner.nextLine();
		System.out.println("la parola è lunga " + a.length() + ' ' + "lettere");
	}

}
