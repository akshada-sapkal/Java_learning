package com.hierarchicalInheritance;

public class BankSystem {
	public static void main(String[] args) {
		  System.out.println("=== Savings Account ===");
	        SavingsAccount sa = new SavingsAccount("SA123", "Akshada", 5000, 5);
	        sa.displayAccountDetails();
	        sa.deposit(2000);
	        sa.calculateInterest();

	        System.out.println("\n=== Current Account ===");
	        CurrentAccount ca = new CurrentAccount("CA456", "Rohan", 3000, 2000);
	        ca.displayAccountDetails();
	        ca.withdraw(4500);
	        ca.checkOverDraft();
	}

}
