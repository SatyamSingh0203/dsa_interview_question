package com.arithmetic;
import java.time.format.FormatStyle;
//sum of the natural number
import java.util.Scanner;

public class SumOfNaturalNumber {
	/*  // first method
		public static int sum(int n) {
			return n * (n + 1) / 2;
		}
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your number");
			int n = sc.nextInt();
			int i = sum(n);
			System.out.println(i);
		}*/
	static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			
			count=count+i;
			
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		sum();
		
	}

}
