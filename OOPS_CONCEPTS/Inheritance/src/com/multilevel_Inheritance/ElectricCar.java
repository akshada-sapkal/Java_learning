package com.multilevel_Inheritance;

public class ElectricCar extends Car{
	int batteryCapacity;
	public void chargeBattery() {
		System.out.println("100% Charged");
	}
	public void displayElectricCarInfo() {
		System.out.println("Brand: "+brand);
		System.out.println("Speed: "+speed);
		System.out.println("Number of Doors: "+numberOfDoors);
		System.out.println("Battery Capacity: "+batteryCapacity);
	}

}
