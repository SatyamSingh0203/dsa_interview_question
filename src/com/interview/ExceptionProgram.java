package com.interview;

public class ExceptionProgram {
	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
	
			System.out.println(e + "   cant't devided by zero");
		} finally {
			System.exit(0); // If we dont't want to execute our finally block go through
			System.out.println("finally block executed");
		}

	}

}
