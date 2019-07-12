package com.stackroute.hackathon2;

public class Car {
	
	private String engineName;
	private int cylinderCount;
	private int wheelCount = 4;
	private boolean isEngine = true;
	private  boolean engineStarted = false;
	
	public Car(String engineName, int cylinderCount) {
		this.engineName = engineName;
		this.cylinderCount = cylinderCount;
	}
	
	public String getEngineName() {
		return engineName;
	}
	
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	
	public int getCylinderCount() {
		return cylinderCount;
	}
	
	public void setCylinderCount(int cylinderCount) {
		this.cylinderCount = cylinderCount;
	}
	
	public int getWheelCount() {
		return wheelCount;
	}
	
	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}
	
	public boolean isEngine() {
		return isEngine;
	}
	
	public void setEngine(boolean engine) {
		isEngine = engine;
	}
	
	public boolean isEngineStarted() {
		return engineStarted;
	}
	
	public void setEngineStarted(boolean engineStarted) {
		this.engineStarted = engineStarted;
	}
	
	public void displayCarInfo(){
		System.out.println("Car Details");
		System.out.println("Car has "+cylinderCount+" cylinders in "+engineName+" engine and it has "+wheelCount+"wheels");
	}
	
	public void startEngine(){
		if(isEngine){
			engineStarted = true;
			System.out.println(engineName+" engine is started");
		} else {
			System.out.println("There is no engine to start");
		}
	}
	
	public void accelerate(){
		if(engineStarted) {
			System.out.println("Speed is increased because car is accelerated");
		} else {
			System.out.println("Please start the engine first");
		}
	}
	
	public void brake(){
		if(engineStarted) {
			System.out.println("Speed is decreased because brake is pressed");
		} else {
				System.out.println("Please start the engine first");
			}
	}
}
