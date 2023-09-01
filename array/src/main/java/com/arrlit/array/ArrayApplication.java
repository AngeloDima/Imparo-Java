package com.arrlit.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayApplication {

	public static void main(String[] args) {

		Map<Integer, cacca> hoMap = new HashMap<>();
		hoMap.put(1, new cacca("ciao"));
		hoMap.put(2, new cacca("asd"));
		hoMap.put(3, new cacca("qwe"));

		for (Map.Entry<Integer, cacca> entry : hoMap.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue().getNome());
		}

		System.out.println("--------------------------------------");
		System.out.println("-------ARRAY LIST-------");
		System.out.println("--------------------------------------");

		ArrayList<Integer> proList = new ArrayList<>();
		proList.add(10);
		proList.add(4230);
		proList.add(410);
		proList.add(1230);

		for (int i = 0; i < proList.size(); i++) {
			System.out.println(proList.get(i));
		}

		System.out.println("--------------------------------------");
		System.out.println("-------ARRAY LIST-------");
		System.out.println("--------------------------------------");
	}

}
