package com.syntax.class05;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner (System.in);
		
			System.out.println("enter a number between 0-1000");
			int num = input.nextInt();
			
			if (num >=0 && num <=10 ) {
				System.out.println("small");
			}
			else if (num >=11 && num <=100 ) {
				System.out.println("medium");
			}
			
			else if (num >=101 && num <=1000) {
				System.out.println("Large");
				} else {
					System.out.println("please enter a number between 0-1000");
				}

		}

	

	}


