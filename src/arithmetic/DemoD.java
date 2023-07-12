package arithmetic;

public class DemoD {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));//true
		
		//_____________________________________________________________________
		String s3 = "java";
		String s4 = "java";
		System.out.println(s3==s4); //true
		System.out.println(s3.equals(s4));//true
		//_________________________________________________________________________
		String s5 = new String("java");
		String s6 = new String("java");
		System.out.println(s5==s6); //false
		System.out.println(s5.equals(s6));//true

	}

}
