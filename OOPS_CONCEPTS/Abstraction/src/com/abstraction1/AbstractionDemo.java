package com.abstraction1;

public class AbstractionDemo {
	public static void main(String[] args) {
		BankAccount b;
		b=new SavingAccount(101, "Akshada", 5000);
		b.deposit(200);
		b.withdraw(100);
		b.displayDetails();
		
		System.out.println("==============================");
		
		b=new CurrentAccount(1001, "Aarush", 10000);
		b.deposit(100);
		b.withdraw(1000);
		b.displayDetails();
		
	}

}
