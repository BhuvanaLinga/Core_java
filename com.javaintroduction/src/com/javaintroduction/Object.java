package com.javaintroduction;

public class Object {
	static int cricketid;
	static String countryName;
	
	int jerseyNum;
	String cricketerName;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cricketid=91;
		countryName="India";
		System.out.println("cricketid : " +cricketid);
		System.out.println("countryName : " +countryName);
		Object msd = new Object();
		msd.jerseyNum = 7;
		msd.cricketerName = "Mahendra singh Dhoni";
		System.out.println("jerseyNumber : " +msd.jerseyNum);
		System.out.println("cricketerName : " +msd.cricketerName);
		

	}

}
