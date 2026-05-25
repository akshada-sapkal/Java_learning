package com.Exception;

//Exception Handling is mechanism to handle runtime errors and

public class Example {
	public static void main(String[] args) {
		try {
			int res=10/0;
			System.out.println(res);
		}catch(Exception e) {
			System.out.println("Cannot divide by zero");
		}finally {
			System.out.println("Program ended");
		}
	}

}
