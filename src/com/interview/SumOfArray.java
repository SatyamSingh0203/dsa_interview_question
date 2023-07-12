package com.interview;

public class SumOfArray {
	static int arr[] = { 2, 2, 2, 2, 2, 2 };

	static void sum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		System.out.println(sum);
		//return sum;
	}
	public static void main(String[] args) {
	//	int sumOfArray=SumOfArray.sum(); 
		//System.out.println(sumOfArray);
		sum();
	}
	//LocalDateTime l=LocalDateTime.now().of(2021, 06, 12, 12, 06);
	
	

}
