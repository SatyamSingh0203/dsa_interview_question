package arithmetic;

public class FactorialUsingRecurson {
	public static  int factorial(int num) {
		if(num>1) {
			return num*factorial(num-1);
		}
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		 int fac=factorial(5);
		 System.out.println("factorial of 5 :"+ fac);
	}
}
