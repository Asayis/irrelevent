package Replit;

import java.util.Scanner;

public class HomeWork20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that takes user's first name and last name and prints in console
		 * 
		 * Instruct the user to enter first name: "Please Enter First Name"
		 * 
		 * Capture the first name
		 * 
		 * Print first name and last name
		 * 
		 */
		
	  	Scanner Scan = new Scanner(System.in);
	    String FirstName;
	    System.out.println("Please Enter First Name"); 
	    
	    FirstName = Scan.nextLine();   
	    
	    String Surname;
	    System.out.println("Please Enter Last Name"); 
	    
	    Surname = Scan.nextLine();   
	       
	    System.out.println("Your full name is: " + FirstName + " " +Surname); 
	}

}
