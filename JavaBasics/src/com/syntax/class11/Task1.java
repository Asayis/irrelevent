package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// using scanner create an array of int value. After the arry is created,
		// calcualte the sum of all stored elementss in that array 

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize = scan.nextInt();
		System.out.println("The size of the array is "+arraySize);
		int [] intArray=new int[arraySize];
		//we can't use enhanced for loop for inserting or updating the values of an array
		System.out.println("please enter " +arraySize+ " elements?");
		for (int i=0; i<intArray.length; i++) {
			intArray[i]=scan.nextInt();// take the value from the user and store the value in that array
		}
		System.out.println(Arrays.toString(intArray));
			
		int sum=0; //taking the input fromt he user and storing it inside the array
		for (int element: intArray) {//advanced for loop
			sum+=element; //take the elements from the array one by one and add them to the sum variable
			
		}
			
		System.out.println("the sum of all the elements are "+sum);
			
		scan.close();
		
	}

}
