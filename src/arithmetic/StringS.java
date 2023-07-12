package arithmetic;

public class StringS {

	public static void main(String[] args) {
		String s="java";
		String ss="java";

		System.out.println(s==ss);
		System.out.println(s.equals(ss));

		String s1=new String("java");
		String s2=new String("java");

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
