package com.javaintroduction;

public class Bsclassloader {

	public static void main(String[] args)throws ClassNotFoundException{
		//Bootstrap class loader
		Class.forName("java.lang.String");
		System.out.println(Class.forName("java.lang.System"));
		//Application class loader
		System.out.println(Class.forName("com.javaintroduction.Student"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));

	}

}
