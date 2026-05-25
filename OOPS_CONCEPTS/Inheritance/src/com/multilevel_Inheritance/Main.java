package com.multilevel_Inheritance;

public class Main {
	public static void main(String[] args) {
		ElectricCar e=new ElectricCar();
		e.brand="Nexon";
		e.speed=100;
		e.numberOfDoors=4;
		e.batteryCapacity=1000;
		System.out.println("Display Electric Car Information>>");
		e.displayElectricCarInfo();
	}
	
	

}
