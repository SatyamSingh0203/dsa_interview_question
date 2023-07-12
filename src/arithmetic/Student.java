package arithmetic;

import java.util.Iterator;
import java.util.Vector;

public class Student {

	int studentID;
	String studentName;

	Student(int studentID, String studentName) {

		studentID = this.studentID;
		studentName = this.studentName;

	}
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	}


	public static void main(String[] args) {
		Vector<Student> student = new Vector<>();
		student.add(new Student(101,"joy"));
		student.add(new Student(102,"mark"));

		System.out.println(student);
		Iterator<Student> iterator=new Iterator<Student>() {
			
			@Override
			public Student next() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
