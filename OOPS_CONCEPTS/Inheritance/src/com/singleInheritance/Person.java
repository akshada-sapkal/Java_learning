package com.singleInheritance;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void displayDetails() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
}
