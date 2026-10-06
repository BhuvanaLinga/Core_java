package com.javaintroduction;

public class MethodDemo {
	
	
	static void StaticMethod1() {
		System.out.println("Static method 1 called");
		StaticMethod2();
	}
	
	

	static void StaticMethod2() {
		System.out.println("Static method 2 called");
		MethodDemo obj = new MethodDemo();
		obj.instanceMethod1();
	}
	
	void instanceMethod1() {
		System.out.println("instance method 1 called");
		instanceMethod2();
	}
	
	
	void instanceMethod2() {
		System.out.println("instance method 2 called");
	}
	
	

	public static void main(String[] args) {
		StaticMethod1();

	}

}
