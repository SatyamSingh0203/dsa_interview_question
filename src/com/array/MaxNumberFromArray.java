package com.array;

public class MaxNumberFromArray {
	public static void main(String[] args) {
		int arr[] = { 5, 10, 9, 12, 22, 12 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			

		}
		System.out.println(max);

	}

}
