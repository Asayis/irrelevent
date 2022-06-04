package com.syntax.class08;

import java.util.Scanner;

public class LoopPractice02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;

		while (a != 51246426) {
			System.out.println("enter secret number");
			a = scan.nextInt();
		}
		System.out.println("How did you know!");
	}

}
