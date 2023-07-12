package com.arithmetic;

//1,1,2,3,5,8,13,21......................Fibonacci
public class Fibonacci {

	public static void main(String[] args) {
		int n = 25;
		int t1 = 0;
		int t2 = 1;
		int t3 = 0;
		System.out.print(t1);
		for (int i = 1; i <= n; i++) {
			t1 = t2;
			t2 = t3;
			t3 = t1 + t2;
			System.out.print(" " + t3);

		}

	}

}
