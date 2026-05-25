package com.java;

public class Bag {
	int price;
	int quantity;
	Bag(int price,int quantity){
		this.price=price;
		this.quantity=quantity;
	}
	public String toString() {
		return "[price:"+ price+ ",quantity: "+quantity+"]";
	}
	public static void main(String[] args) {
		Bag b=new Bag(200,2);
		System.out.println(b);
	}

}
