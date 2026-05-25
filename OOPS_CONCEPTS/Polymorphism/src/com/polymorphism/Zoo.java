package com.polymorphism;

public class Zoo {
	public static void main(String[] args) {
		Animal a;
		a=new Cat();
		System.out.println(a.makeSound());
		a=new Dog();
		System.out.println(a.makeSound());
		a=new Lion();
		System.out.println(a.makeSound());
		
	}

}
