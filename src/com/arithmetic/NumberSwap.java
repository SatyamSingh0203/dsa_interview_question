 package com.arithmetic;
// i=10, j=20---->i=20,j=10; Swaping
public class NumberSwap {
	public static void main(String[] args) {
		int i=1231341;
		int j=223423423;
		int k=0;
		/*i=j-i; //10
		j=j-i;//10
		i=i+j;//20
	
		*/
//		Second Ways
		k=i+j;//30
		i=k-i;//20
		j=k-j;
		
		System.out.println("i ="+i+" j ="+j);
	}

}
