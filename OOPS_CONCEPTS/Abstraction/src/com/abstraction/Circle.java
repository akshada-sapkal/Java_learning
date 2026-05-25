package com.abstraction;

public class Circle implements Shape{
	int r=10;
	@Override
	public void calArea() {
		double area=3.14* r* r;
		System.out.println("Area of Circle is: "+area);
	}
}
