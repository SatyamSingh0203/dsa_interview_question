package com.interview;

public class ReverseStringWithoutMethod {

	public static String reverseString(String str) {
		char[] chars = str.toCharArray();
		int left = 0;
		int right = chars.length - 1;

		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}

		return new String(chars);

	}

	public static void main(String[] args) {
		String s = reverseString("satyam");
		System.out.println(s);
	}
	/*In this code, we first convert the input string into an array of characters using the toCharArray() method. 
	 * We then initialize two pointers, left and right, to the first and last indices of the array, respectively.
	
	We then enter a while loop that continues as long as left is less than right. 
	Inside the loop, we swap the characters at the left and right indices using a temporary 
	variable temp, and then increment left and decrement right to move toward the middle of the string.
	
	Finally, we return the reversed string by creating a new String object from the reversed character array using the constructor new String(chars).
	*/

}
