package com.javaintroduction;

public class Students {
	
	static {
		String collegeName = "KITS";
		 System.out.println("collegeName = "+collegeName);
	}
	
	{
		System.out.println("Student object created");
	}
	
	void displayStudentDetails() {
		int rollno =12;
		String Name = "Bhuvana";
		int marks = 80;
		System.out.println("rollno : "+ rollno);
		System.out.println("Name : "+ Name);
		System.out.println("marks : "+ marks);
		
	}
	
	static void diaplayCollegedetails(){
		String collegeName = "KITS";
		System.out.println("collegeName : "+collegeName);
		
	}

	public static void main(String[] args) {
		Students s = new Students();
		Students. diaplayCollegedetails();
		s.displayStudentDetails();
	

	}

}
