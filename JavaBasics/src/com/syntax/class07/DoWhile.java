package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {

		int num = 1;

		while (num <= 3) {
			System.out.println(num + " ");
			num++;

		}

		System.out.println("--------------");

		int num1 = 10;

		do {
			System.out.println(num + "");
		} while (num1 <= 3);

		// do while first executes the code
		// and only then checks the condition
		
		int num2 = 10;
		do {
			System.out.println(num2 + " ");
			num2++;
			
		} while (num2 <= 3);
		
		// print number 1 to 30 using while
		
		int num3 = 1;
		do {
			System.out.print(num3 + " ");
			num3++;
		} while (num3 <= 30);
		
		System.out.println("--------------");

		
		int num4 = 70;
		do {
			System.out.print(num4 + " ");
			num4 -=2;
		} while (num4 >= 30);
			
		
	}

}
