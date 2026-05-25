package com.encapsulation_example1;

public class Main {
	public static void main(String[] args) {
		Student s=new Student();
		//Setting values using setters
		s.setName("Akshada");
		s.setAge(22);
		//getting values using getters
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());
		
	}

}
