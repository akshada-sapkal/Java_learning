package com.multilevel_Inheritance;

public class Car extends Vehicle{
	int numberOfDoors;
	public void playMusic() {
		System.out.println("Playing music in the car");
	}
	public void displayCarInfo() {
		System.out.println(brand);
		System.out.println(speed);
		System.out.println(numberOfDoors);
	}
}
