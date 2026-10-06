package com.javaintroduction;

public class Student {
	static String collegeName;
	
	String StudentName;
	int student_id;
	int student_marks;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		collegeName = "KITS";
		 Student os = new Student();
		 os.student_id=1234;
		 os.StudentName="Bhuvana";
		 System.out.println(collegeName);
		 System.out.println(os.student_id);
		 System.out.println(os.StudentName);
		

	}

}
