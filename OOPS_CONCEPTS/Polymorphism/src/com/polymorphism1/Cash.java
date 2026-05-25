package com.polymorphism1;

public class Cash extends Payment{

	@Override
	public void pay() {
		System.out.println("Pay by Cash");
	}

}
