package com.stackroute.hackathon2;

public class Hyundai extends Car {
	
	public Hyundai(String engineName, int cylinderCount) {
		super(engineName, cylinderCount);
	}
	
	@Override
	public void displayCarInfo(){
		System.out.println("Hyundai Car Details");
		System.out.println("Hyundai car has "+getCylinderCount()+" cylinders in "+getEngineName()+" engine and it has "+getWheelCount()+"wheels");
	}
}
