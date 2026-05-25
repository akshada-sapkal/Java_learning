package com.abstraction1;

public class CurrentAccount extends BankAccount{
	private double overdraftLimit;

	public CurrentAccount(double accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=balance+overdraftLimit) {
			balance=balance-amount;
			System.out.println("Withdrawn Rs"+amount+"from Current Account");
	}else {
		System.out.println("No Sufficient amount in Current Account");
	}

 }
}
