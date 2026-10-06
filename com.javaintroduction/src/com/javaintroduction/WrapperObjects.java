package com.javaintroduction;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WrapperObjects {
	
	BigInteger bi = new BigInteger("100");
	BigInteger bi1 = new BigInteger("1000");
	BigDecimal bd = new BigDecimal("10000");
	
	Integer i = 100;//AutoBoxing
	Boolean bool = false;
	


	public static void main(String[] args) {
		WrapperObjects w = new WrapperObjects();
		System.out.println(w.bi);
		System.out.println(w.bd);
		System.out.println(w.bi.add(w.bi1));
		System.out.println(w.bi.multiply(w.bi1));
		System.out.println(w.bi.divide(w.bi1));
		System.out.println(w.bi.mod(w.bi1));
		
		
		System.out.println(w.i);
		System.out.println(w.bool);

	}

}
