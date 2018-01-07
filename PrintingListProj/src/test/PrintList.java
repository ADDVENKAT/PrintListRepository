package test;

import java.util.ArrayList;
import java.util.List;

public class PrintList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("dileep");
		list.add("siva");
		list.add("ramu");
		list.add("ramesh");

		for (int i = 0; i < 4; i++) {

			System.out.println(list.get(i));

		}

	}

}
