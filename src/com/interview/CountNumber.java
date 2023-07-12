package com.interview;

import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		int a = sc.nextInt();
		System.out.println("Enter your second number");

		int b = sc.nextInt();
		int c = a + b;
		int count=0;
		System.out.println("Sum of number" + c);
		while(a>0) {
			a=a/10;
			count++;
			
		}
		if(count>3) {
			throw new IllegalArgumentException("machine can not perform task more than 3 digit");
			
		}

	}

}
