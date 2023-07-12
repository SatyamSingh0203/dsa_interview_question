package arithmetic;

public class PilindromNumber {
	public static void main(String[] args) {
		int num = 128;
		int temp = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if(num==temp) {
			System.out.println(temp+" is pilindrom");
		}
		else
			System.out.println(temp+" is not pilindrom");
	}

}
