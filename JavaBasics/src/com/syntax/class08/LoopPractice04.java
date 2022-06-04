package com.syntax.class08;

import java.util.Scanner;

public class LoopPractice04 {
	public static void main(String[] args) {
		
		int SN = 25;
		int GN;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Guess my secret number");
			GN = scan.nextInt();
		} while (GN != SN);
		
		System.out.println("You got it");
		
	}

}
