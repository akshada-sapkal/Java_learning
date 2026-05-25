package com.abstraction;

public class Rectangle implements Shape{
	int l=10;
	int b=20;
	@Override
	public void calArea() {
		double area=l*b;
		System.out.println("Area of Rectangle is: "+area);
	}

}
