package com.javaintroduction;

public class Test {
	
	static void staticMethod1() {
		System.out.println("Static method 1 started");
	}
	
	static void staticMethod2() {
		System.out.println("Static method 2 started");
	}
	
	
	static void staticMethod3() {
		System.out.println("Static method 3 started");
	}
	
	
	void instanceMethod1() {
		System.out.println("Instance Method 1 started");
	}
	
	
	void instanceMethod2() {
		System.out.println("Instance Method 2 started");
	}
	
	static {
		
		staticMethod1();
		staticMethod2();
		staticMethod3();
	
		
	Test obj = new Test();
	obj.instanceMethod1();
	obj.instanceMethod2();
	
	}
	
	public static void main(String[] args) {
		
	

	}

}
