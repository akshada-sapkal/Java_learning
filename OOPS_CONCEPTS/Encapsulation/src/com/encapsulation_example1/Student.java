package com.encapsulation_example1;

//Encapsulation:Process of wrapping or binding the data members,properties of an object and member functions into one single unit.
//Advantage: 
//1)Data Hiding: variables are kept private, Only accessible through getters & setters,Prevents direct access from outside
//2) Provides security 
public class Student {
	//Private variables : hidden from outside
	private String name;
	private int age;
	
	//Helper Methods
	//Getter() - Access/Fetch value of private variable
	//Setter() - Set/Update/Modify value of private variable
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}else {
			System.out.println("Invalid name!");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}else {
			System.out.println("Age must positive");
		}
	}
	
	
	
	
	

}
