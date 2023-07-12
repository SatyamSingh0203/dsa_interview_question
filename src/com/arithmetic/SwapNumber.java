package com.arithmetic;

public class SwapNumber {
	public static void main(String[] args) {
		int i=700;
		int j=900;
		/*i=i+j;//30
		j=i-j;//10
		i=i-j;//20
		*/
		int k=0;
		k=i+j;
		i=k-i;
		j=k-j;
		
		System.out.println("[i is "+i+"] ["+" j is ]"+j);
	}

}
