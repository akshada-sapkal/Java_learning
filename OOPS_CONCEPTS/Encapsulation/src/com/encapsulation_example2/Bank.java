package com.encapsulation_example2;

public class Bank {
	private double balance=5000;
	
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Amount deposited successfully");
		}else {
			System.out.println("Enter appropriate amount");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -= amount;
			System.out.println("Amount withdrawn successfully"+amount);
		}else {
			System.out.println("You have not sufficient balance");
		}
	}
	public double getBalance() {
		return balance;
	}

	
	
	

}
