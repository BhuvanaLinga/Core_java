package com.javaintroduction;

public class GarbageCollection {
	int a;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalise method started");
	}
	
	static {
		
		System.out.println("inside the method");
		GarbageCollection gc4 = new GarbageCollection();
		
		
	}

	public static void main(String[] args) {
		GarbageCollection gc1 = new GarbageCollection();
	
		gc1.a=10;
		System.out.println("value "+gc1.a);
		
		GarbageCollection gc2 = new GarbageCollection();
		
		GarbageCollection gc3 = new GarbageCollection();
		
		gc1 = null;//nullifying the object
		//gc2 = null;
		
		gc3 = gc2;//re-assigning the object
	
		
		new GarbageCollection();//anonymous object
		
		System.gc();
		
		

	}

}
