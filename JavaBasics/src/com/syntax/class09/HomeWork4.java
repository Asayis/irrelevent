package com.syntax.class09;

public class HomeWork4 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array

		int [] a = {1, 2, 3, 4, 5, 6, 7, 8}; // a is creating the array + index
		int Jerry=0; // I am using Jerry to add the sum
				
		for (int b=0; b<a.length; b++) {
			Jerry += a[b]; //var(jerry) to calculate the sum+=arrays[changes the value] // 
			}
			// b is a new int, then b 
				
		System.out.println(Jerry);
		
	}

}
