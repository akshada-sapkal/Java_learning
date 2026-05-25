package com.abstraction;

public class Main {
	public static void main(String[] args) {
		Shape s;
		s=new Circle();
		s.calArea();
		s=new Square();
		s.calArea();
		s=new Rectangle();
		s.calArea();
	}

}
