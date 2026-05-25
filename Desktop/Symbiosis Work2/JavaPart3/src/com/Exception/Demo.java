package com.Exception;

//Exception: Exception is unexpected problem which occurs during execution of program due to abnormal scenario.
//When exception occurs execution of program suddenly gets stopped because of risky line of code/unexpected problem.

//There are two types of Exception:
//1) Checked Exception: Compiler aware exception, It is mandatory to declare the checked exception if programmer wants to compile the program successfully.
//Ex. FileNotFoundException, IOException, SQLException, ClassNotFoundException

//2) Unchecked Exception: Compiler unaware exception.
//It is not mandatory to declare the unchecked exception but handling unchecked exception is mandatory.
//Ex. Runtime Exception and its child class
//Error and its child class



public class Demo {
	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println(10/2);
//		Arithmetic Exception get occur when we divide number by zero
		System.out.println(10/0);
		System.out.println("Bye");
		
//		NullPointerException gets occur when we try to access specific location by using non-primitive variable which has value as null.
		String s=null;
		System.out.println(s.length());
	}

}
