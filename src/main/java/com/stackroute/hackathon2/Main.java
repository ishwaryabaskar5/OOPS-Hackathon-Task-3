package com.stackroute.hackathon2;

public class Main {
	
	public static void main(String[] args){
	
//		Jaguar car
		Jaguar jaguar = new Jaguar("straight-four",4);
		jaguar.displayCarInfo();
		jaguar.accelerate();
		jaguar.startEngine();
		jaguar.accelerate();
		jaguar.brake();
		
//		Hyundai Car
		Hyundai hyundai = new Hyundai("V6",6);
		hyundai.displayCarInfo();
		
//		Ford Car
		Ford ford = new Ford("V8",8);
		ford.displayCarInfo();
	}
}
