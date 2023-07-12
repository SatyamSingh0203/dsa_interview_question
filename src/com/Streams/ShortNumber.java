package com.Streams;

import java.util.List;

public class ShortNumber {
	public static void main(String[] args) {
		List<Integer> list = List.of(22, 33, 44, 22, 55, 64, 32, 21);
		/*
				List<Integer> list = List.of(22, 33, 44, 22, 55, 64, 32, 21);
				list.stream().sorted().forEach(System.out::println);
				*/
		/*
				List<Integer> integer = list.stream().sorted().toList();
				System.out.println(integer);*/
		
		
		List<Integer>list1=list.stream().filter(i -> i>30).toList();
		System.out.println(list1);

	}

}
