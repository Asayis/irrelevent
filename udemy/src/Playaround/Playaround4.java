package Playaround;

import java.util.Scanner;

public class Playaround4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in 5 numbers below and I will add the sum");

		int[] array = new int[5]; //created an array of 5 elements 
		int total = 0; //total is the variable used to sum up the element

		for (int firstloop = 0; firstloop < array.length; firstloop++) {//the loop identifies the amount loops using the array.length 
			array[firstloop] = scan.nextInt(); //the input uses the firstloop variable to change the index of array
		}

		for (int addingarraytome : array) {
			total += addingarraytome; //
		}
		System.out.println("Your total would be " + total);

	}

}
