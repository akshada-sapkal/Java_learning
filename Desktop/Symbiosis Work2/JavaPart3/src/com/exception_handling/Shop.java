package com.exception_handling;

//Difference between throw and throws
// 1)throw: It creates and throws the exception.
//          It is written inside method.
//          It works with exception object.
//          We can create one exception at a time.

// 2)throws: It declares the exception.
//           It is written in method declaration statement.
//           It works with exception class names.
//           We can declare multiple exceptions.

import java.util.Arrays;
import java.util.Scanner;

public class Shop {
	public static int productAvailable(int index,int length) throws ProductNotFoundException {
		if(index>=0 && index<length) {
			return index;
		}else {
			throw new ProductNotFoundException("not available");
		}
	}
	public static void main(String[] args) {
		String[] products= {"Mobile","TV","Washing machine","Fridge","Tab"};
		System.out.println("Welcome to Gada Electronics :)");
		System.out.println("We have to products like: ");
		System.out.println(Arrays.toString(products));
		System.out.println("Enter product position from 0-4");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		try {
			if(productAvailable(index,products.length-1)>=0) {
				System.out.println("You can buy "+products[index]);
			}
		}catch(ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}	
	}
}
