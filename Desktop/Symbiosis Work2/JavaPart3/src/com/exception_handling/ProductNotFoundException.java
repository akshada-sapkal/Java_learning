package com.exception_handling;

//Custom Exception: Exception which is created by programmer and which is not present in exception hierarchy

public class ProductNotFoundException extends Exception{
	ProductNotFoundException(String msg){
		super(msg);
	}

}
