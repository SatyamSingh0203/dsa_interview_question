package com.Streams;

import java.util.List;

public class MinNumber {
	public static void main(String[] args) {
		List<Integer> list = List.of(5, 4, 33, 66, 77, 22, 1, 44);
		Integer integer = list.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println(integer);

	}

}
