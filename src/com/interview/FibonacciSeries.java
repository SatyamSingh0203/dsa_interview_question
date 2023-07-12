package com.interview;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=10;
		int t1=0,t2=1,t3=0;
		System.out.print(t1+" "+t2+" ");
		for(int i=1;i<=n;i++) {
			t3=t1+t2;
			t1=t2;
			t2=t3;
			System.out.print(t3+" ");

			
		}
	}

}
