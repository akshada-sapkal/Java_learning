package com.java;

public class Book {
	double price;
	Book(double price){
		this.price=price;
	}
	public boolean equals(Object ob) {
		Book b=(Book) ob;
		return this.price==b.price;
	}
	public static void main(String[] args) {
		Book b1=new Book(200);
		Book b2=new Book(200);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

}
