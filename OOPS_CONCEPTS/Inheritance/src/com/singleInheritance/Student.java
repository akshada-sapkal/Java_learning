package com.singleInheritance;

public class Student extends Person{
	int rollNo;
	String course;
	public Student(String name, int age, int rollNo, String course) {
		super(name, age);
		this.rollNo = rollNo;
		this.course = course;
	}
	public void displayStudentDetails() {
		displayDetails();
		System.out.println("rollNo: "+rollNo);
		System.out.println("course: "+course);
	}
	
	public static void main(String[] args) {
		Student s=new Student("Akshada",22,47,"Computer Science");	
		s.displayStudentDetails();
	}
}
