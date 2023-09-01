package com.prenotazioni.preno;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrenoApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<Integer, Hotel> hotelMap = new HashMap<>();
		hotelMap.put(1, new Hotel("castello bianco", 30));
		hotelMap.put(2, new Hotel("castello giallo", 340));
		hotelMap.put(3, new Hotel("castello verde", 3310));

		System.out.println("in quale hotel ti vuoi prenotare?");
		for (Map.Entry<Integer, Hotel> entry : hotelMap.entrySet()) {
			System.out.println(entry.getKey() + ") " + entry.getValue().getNome());
		}

		int scelta = scanner.nextInt();
		Hotel hotelScelto = hotelMap.get(scelta);

		System.out.println("Hai scelto " + hotelScelto.getNome());
		System.out.println("quante camere vuoi prenotare? rimangono solo " + hotelScelto.getCamere() + ' ' + "camere");
		int pren = scanner.nextInt();
		int somma = hotelScelto.getCamere() - pren;
		System.out.println("RIEPILOGO");
		System.out.println("hai scelto l'hotel: " + hotelScelto.getNome());
		System.out.println("hai prenotato: " + pren + ' ' + "camere");
		System.out.println("all'hotel ne rimangolo: " + somma + ' ' + "camere");

	}
}
