package arithmetic;
// 153 ---> 1 5 3 of qube plus = 153
public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println(temp +" is Armstrong number");
		}
		else {
			System.out.println(temp+" is not Armstrong number");
		}
	}
}
