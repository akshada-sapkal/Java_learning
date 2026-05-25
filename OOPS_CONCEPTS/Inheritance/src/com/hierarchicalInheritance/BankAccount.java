package com.hierarchicalInheritance;

public class BankAccount {
	String accountNumber;
	String accountHolderName;
	double balance;
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance = balance+ amount;
		System.out.println("Total amount is:"+balance);
		
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Amount deducted Sucessfully");
		}else {
			System.out.println("There is no sufficient amount in your account");
		}
	}
	public void displayAccountDetails() {
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Account Holder Name:"+accountHolderName);
		System.out.println("Balance"+balance);
	}

}
