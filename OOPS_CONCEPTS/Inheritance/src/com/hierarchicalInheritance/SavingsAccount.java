package com.hierarchicalInheritance;

public class SavingsAccount extends BankAccount{
	double interestRate;
	
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}

	public void calculateInterest() {
		double interest= balance *(interestRate/100);
		balance=balance+interest;
		System.out.println("Interest added: " + interest + ". New balance: " + balance);
	}
}
