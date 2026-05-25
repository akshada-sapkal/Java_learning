package com.polymorphism1;

public class CreditCard extends Payment {
	@Override
	public void pay() {
		System.out.println("Pay by Credit Card");
	}

}
