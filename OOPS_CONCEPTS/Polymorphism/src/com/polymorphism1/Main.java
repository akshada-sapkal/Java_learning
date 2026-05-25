package com.polymorphism1;

public class Main {
	public static void main(String[] args) {
		Payment p;
		p=new CreditCard();
		p.pay();
		p=new UPI();
		p.pay();
		p=new Cash();
		p.pay();
	}

}
