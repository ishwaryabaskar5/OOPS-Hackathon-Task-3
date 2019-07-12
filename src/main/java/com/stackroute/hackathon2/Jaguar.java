package com.stackroute.hackathon2;

public class Jaguar extends  Car{
	
	public Jaguar(String engineName, int cylinderCount) {
		super(engineName, cylinderCount);
	}
	
	@Override
	public void displayCarInfo(){
		System.out.println("Jaguar Car Details");
		System.out.println("Jaguar car has "+getCylinderCount()+" cylinders in "+getEngineName()+" engine and it has "+getWheelCount()+"wheels");
	}
}
