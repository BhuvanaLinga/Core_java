package com.javaintroduction;

public class Count {
	static int count=0;
	{
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c= new Count();
		Count c1 = new Count();
		System.out.println(count);

	}

}
