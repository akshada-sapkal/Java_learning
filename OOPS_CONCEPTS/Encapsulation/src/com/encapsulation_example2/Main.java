package com.encapsulation_example2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println("Welcome to Mini Bank Application");
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("Enter 1 for checking the balance");
		System.out.println("Enter 2 for deposit");
		System.out.println("Enter 3 for withdraw");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println(b.getBalance());
	           break;
		case 2:System.out.println("Enter amount to deposit");
		       double depositAmount=sc.nextDouble();
		       b.deposit(depositAmount);
		       System.out.println("Your balance is: "+b.getBalance());
		       break;
		       
		case 3:System.out.println("Enter amount for withdraw");
		       double withdrawAmount=sc.nextDouble();
		       b.withdraw(withdrawAmount);
		       System.out.println("Your balance is: "+b.getBalance());
		       break;
		default:System.out.println("Enter valid choice");
		}
		}
	}
}
