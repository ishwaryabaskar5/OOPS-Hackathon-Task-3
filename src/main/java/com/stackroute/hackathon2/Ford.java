package com.stackroute.hackathon2;

public class Ford extends Car {
	
	public Ford(String engineName, int cylinderCount) {
		super(engineName, cylinderCount);
	}
	
	@Override
	public void displayCarInfo(){
		System.out.println("Ford Car Details");
		System.out.println("Ford car has "+getCylinderCount()+" cylinders in "+getEngineName()+" engine and it has "+getWheelCount()+"wheels");
	}
}
