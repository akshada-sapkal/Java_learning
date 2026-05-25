package com.abstraction1;

public class SavingAccount extends BankAccount{
	private static final double minBalance=1000;
	public SavingAccount(double accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(balance - amount >= minBalance) {
			balance=balance-amount;
			System.out.println("Withdrawn Rs"+amount+" from Savings Account");
		}else {
			System.out.println("No Sufficient Amount in Savings Account");
		}	
	}

}
