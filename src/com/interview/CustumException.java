package com.interview;

public class CustumException extends Exception {
	String s;

	public CustumException(String s) {
		this.s = s;

	}
	public static void main(String[] args)  {
		int marks=101;
		
		try {
			if(marks>100) {
				throw new CustumException("marks can't be greter then 100");
				
			}
			else {
				System.out.println("valid marks");
			}
		} catch (CustumException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
