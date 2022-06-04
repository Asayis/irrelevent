package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkConvertWeather {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius and print “The temperature in the city __ is __”
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("What city do you live");
		String city=input.next();
		
		System.out.println("What is the temperature in your city?");
		int Fahrenheit=input.nextInt();
		int Celsius=((Fahrenheit-32)*5)/9;
		System.out.println("the temperature is the city "+city+" is "+Celsius+" C. "); 

	}

}