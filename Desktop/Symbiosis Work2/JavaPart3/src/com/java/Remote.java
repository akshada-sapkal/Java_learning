package com.java;

public class Remote {
	public static void main(String[] args) {
		Remote r=new Remote();
		System.out.println(r);//toString method called implicitly, automatically
		System.out.println(r.toString());//also can be called explicitly
		System.out.println(r.hashCode());//It can be called explicitly
	}
	

}
