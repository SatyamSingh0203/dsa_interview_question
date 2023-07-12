package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;

public class ShortExample {
	public static void main(String[] args) {
		/*ArrayList<Integer> marks=new ArrayList<>();
		marks.add(22);
		marks.add(12);
		marks.add(25);
		marks.add(20);
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);*/
		
		
     /*rrayList<Emp> emp=new ArrayList<>();
     emp.add(new Emp("satyam",28));
     emp.add(new Emp("deepak",25));
     System.out.println(emp);
     Collections.sort(emp);
     System.out.println(emp);
     
     */
		
		ArrayList<Emp> emp=new ArrayList<>();
	     emp.add(new Emp("satyam",28));
	     emp.add(new Emp("deepak",25));
	     emp.add(new Emp("ravi",15));

	     System.out.println(emp);
	     
	     Collections.sort(emp,new IDComparator());
	     System.out.println(emp);
	     
	     ArrayList<Emp> emp1=new ArrayList<>(emp);
	     Collections.sort(emp1,new NameComparator());
	     System.out.println(emp1);

	}

}
