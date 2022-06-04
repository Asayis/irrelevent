package com.syntax.class05;

import java.util.Scanner;

public class InchAndHeight {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter person heights in inches");
	int num = scan.nextInt();
	
	if (num < 60) {
		System.out.println("Short");
	} else if (num < 60 && num > 72) {
	System.out.println("medium");
	} else if(num>72);
	System.out.println("tall");
}

}
