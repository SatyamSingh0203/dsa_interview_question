package com.demo;

public class NumberFormat {
	public static void main(String[] args) {
		List<Integer> list = List.of(121, 131, 142, 151);
		List<Integer> list1 = list.stream().filter(e -> e % 10 == 1).collector1(Collectors.toList());
		System.out.println(list1);

	}

}
