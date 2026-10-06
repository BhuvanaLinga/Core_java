package com.javaintroduction;

public class BankAccount {
	static int balance = 1000;
	
	void deposit() {
		int amount = 100;
		balance = balance + amount;
		
		
	}
	
	void withdraw() {
		int amount = 200;
		balance = balance - amount;
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.deposit();
		acc.withdraw();
		System.out.println("Final amount : "+balance);
		

	}

}
