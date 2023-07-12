package com.array;

import java.util.Scanner;

public class DynamicScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of values: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
