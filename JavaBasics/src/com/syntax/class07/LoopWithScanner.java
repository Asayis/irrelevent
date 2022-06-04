package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		/*
		 * we are going to ask you if you got a job
		 * 
		 * once you say yes --> Congratualation
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		String job;
		
		do {
			
			System.out.println("Mum said: Did you get a job yet?");
			job=scan.next();
			
		} while (!job.equalsIgnoreCase("Yes"));
	
		System.out.println("congratulation");
		
		System.out.println("------------------------------------------");
		
		
			
	}

}
