package Replit;

import java.util.Scanner;

public class HomeWork32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		char m = scan.next().charAt(0);

		if (m == 'm') {
			  System.out.println("Please enter your age");
			  int age = scan.nextInt();
              
			  if (age > 25) {System.out.println("Man");} 
			  else {System.out.println("Boy");}           }

		

		else if (m == 'f') {

			System.out.println("Please enter your age");
			int age = scan.nextInt();
            
			if (age > 25) {
				System.out.println("Woman");} 
			else {System.out.println("Girl");}            }

	}

}
