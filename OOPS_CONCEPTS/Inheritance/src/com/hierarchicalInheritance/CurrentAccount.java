package com.hierarchicalInheritance;

public class CurrentAccount extends BankAccount{
	double overdraftlimit;
	public CurrentAccount(String accountNumber, String accountHolderName, double balance,double overdraftlimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftlimit=overdraftlimit;
	}
	public void withdraw(double amount) {
		if(amount<= balance+overdraftlimit) {
			balance=balance-amount;
			System.out.println(amount + " withdrawn using current account. Remaining balance: " + balance);
		}else {
			System.out.println("Overdraft limit exceeded");
		}
	}
	public void checkOverDraft() {
		if (balance < 0) {
            System.out.println("Overdraft used! Current negative balance: " + balance);
        } else {
            System.out.println("No overdraft used. Balance is positive.");
        }
	}
}
