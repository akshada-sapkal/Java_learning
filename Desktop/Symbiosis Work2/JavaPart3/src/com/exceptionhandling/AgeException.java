package com.exceptionhandling;

import java.util.Scanner;

public class AgeException {
	public static void checkAge(int age) throws AgeInvalidException{
		if(age<18) {
			System.out.println("Not Eligible");
		}else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		try {
			checkAge(age);
		}catch(AgeInvalidException e) {
			
		}finally {
			System.out.println("Completed");
		}
	}
}
