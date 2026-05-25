package com.abstraction1;

abstract public class BankAccount {
	double accountNumber;
	String accountHolderName;
	double balance;
	
	public BankAccount(double accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	abstract public void withdraw(double amount);
	public double deposit(double amount) {
		balance=balance+amount;
		System.out.println("Amount Deposited Successfully");
		return amount;	
	}
	public void displayDetails() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
	}
	

}
