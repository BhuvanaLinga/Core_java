package com.javaintroduction;

public class AutoBoxingUnBoxing {
	int id = 101;
	double marks = 81.5;
	boolean st = true;
	
	//Auto-Boxing
	
	Integer Stu_id = id;
	Double Stu_marks = marks;
	Boolean pass_status = st;
	
	//Auto-UnBoxing
	
	int id1 = Stu_id;
	double marks1 = Stu_marks;
	boolean status = pass_status;
	

	public static void main(String[] args) {
		AutoBoxingUnBoxing  w = new AutoBoxingUnBoxing ();
		System.out.println(w.Stu_id);
		System.out.println(w.Stu_marks);
		System.out.println(w.pass_status);
		
		
		System.out.println(w.id1);
		System.out.println(w.marks1);
		System.out.println(w.status);
		

	}

}
