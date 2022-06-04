package Replit;

import java.util.Scanner;

public class HomeWork22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
	    System.out.println("Enter your name"); 
	    String FirstName = Scan.next();
	    
	    System.out.println("Enter your mobile number");
	    String number = Scan.next();
	    
	    System.out.println("Enter your age");
	    int age = Scan.nextInt();
	    
	    System.out.println("Your name is "+FirstName+", your age is "+age+" and your mobile number is "+number);
	    		
  }
}