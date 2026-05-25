package com.abstraction;

public class Square implements Shape{
	int side=20;
	@Override
	public void calArea() {
	int area=side*side;
	System.out.println("Area of Square is: "+area);
	}

}
