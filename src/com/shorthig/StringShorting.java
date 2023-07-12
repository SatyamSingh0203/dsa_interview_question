package com.shorthig;

public class StringShorting {
	public static void main(String[] args) {
		/*String s[] = { "satyam", "aman", "deepak", "john", "ravi" };
		String temp;*/
		int s[]= {11,34,5,6,77,86,33,87};
		int temp;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length - 1; j++) {
//				if (s[j].compareTo(s[j + 1]) > 0) {
				if (s[j]>s[j + 1]) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}

			}
			System.out.print(s[i] + " ");
		}
		


	}

}
