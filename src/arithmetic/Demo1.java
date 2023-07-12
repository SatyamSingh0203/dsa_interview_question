package arithmetic;


public class Demo1 {

	public static void main(String[] args) {
		int n=5;
		int space=1;
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print("");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=5;i>=1;i--) {
			for(int j=0;j<i;j++) {
			System.out.print("* ");
			}
			System.out.println();
			
			
		}
		
	}

}
