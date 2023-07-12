package com.interview;

public class ReversString {
	public static void main(String args[]) {
		String string = "java is awesome";
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			rev=rev + string.charAt(i);
			
		}
		System.out.print(rev);
		

	}

}
