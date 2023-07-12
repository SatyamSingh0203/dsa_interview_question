package com.Streams;

import java.util.List;

public class MapMethod {
	public static void main(String[] args) {
		List<Integer> list = List.of(4, 8, 7, 9, 10);
		List<Integer> integer = list.stream().map(i -> i * i).toList();
		System.out.println(integer);

		// list.stream().map(i->i*i).toList().forEach(System.out::println);

	}

}
