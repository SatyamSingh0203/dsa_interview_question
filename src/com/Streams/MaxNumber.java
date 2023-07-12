package com.Streams;

import java.util.List;

public class MaxNumber {
	public static void main(String[] args) {
		List<Integer> number = List.of(22, 33, 11, 23, 12, 34);
		// number.stream().forEach(System.out::println);
		Integer integer=number.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(integer);

	}

}
