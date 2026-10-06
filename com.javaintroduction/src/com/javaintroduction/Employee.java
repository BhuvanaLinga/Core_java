package com.javaintroduction;

public class Employee {
	
	int emp_id;
	String emp_Name;
	int salary;
	
	static String company_Name;
	
	static {
		company_Name = "Vcube software solutions";
	}
	
	
	 {
	     System.out.println("Welcome to VCube");
	    // Employee os = new Employee();
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Employee os1 = new Employee();
		os1.emp_id = 101;
		os1.emp_Name = "abc";
		os1.salary = 20000;
		System.out.println("company name : " +company_Name);
		System.out.println("employee id : " +os1.emp_id);
		System.out.println("employee name : " +os1.emp_Name);
		System.out.println("salary : " +os1.salary);
		
		
		Employee os2 = new Employee();
		os2.emp_id = 102;
		os2.emp_Name = "def";
		os2.salary = 30000;
		System.out.println("company name : " +company_Name);
		System.out.println("employee id : " +os2.emp_id);
		System.out.println("employee name : " +os2.emp_Name);
		System.out.println("salary : " +os2.salary);
		
		
		
		Employee os3 = new Employee();
		os3.emp_id = 103;
		os3.emp_Name = "ghi";
		os3.salary = 40000;
		System.out.println("company name : " +company_Name);
		System.out.println("employee id : " +os3.emp_id);
		System.out.println("employee name : " +os3.emp_Name);
		System.out.println("salary : " +os3.salary);
		
	

	}

}
