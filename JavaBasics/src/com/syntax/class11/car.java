package com.syntax.class11;

public class car {

	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int NoOfDoors;
	int HP;
	
	void moveForwad() {
		System.out.println("Car is moving forwad");
	}
	void reverse() {
		System.out.println("It is moving backward");
	}
	public static void main(String[] args) {
		car bmw=new car();
		bmw.model="x6";
		bmw.color="Black";
		bmw.year=2022;
		bmw.typeOfEngine="V8";
		bmw.HP=500;
		
		System.out.println(bmw.model);
		
		bmw.moveForwad();
		bmw.reverse();
		
		car lexus=new car();
		lexus.make="Lexus";
		lexus.model="LX570";
		lexus.color="white";
		//lexus.
			
			
		}
	
}
