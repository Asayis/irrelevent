package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// >, <, <=, >=, ==, !=
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2); //f
		System.out.println(num1<num2); // t
		System.out.println(num1!=num2); // t
		
		System.out.println(num1==num2); // no=f
		System.out.println(num1=num2); // 22
		
		System.out.println(num1==num2);
		
		boolean result=100>200;
		System.out.println(result);
		
		int result1=100+200;
		String result2="emre"+10;
		
		System.out.println(result1);
		System.out.println(result2);
		
		int num3=10;
		int num4=11;
		
		result=num3==num4; //if num3 equal to num4
		System.out.println(result); 
		
		//
		result1=num3+num4; // 
		System.out.println(result1);
		
		double mortgageRate = 4.5;
		if (mortgageRate>5) {
			System.out.println("I am not buying a house");
			
		}
			
			int num5=99;
			int num6=10;
			
			if (num5<num6) {
				System.out.println(num1+" is bigger than "+num2);
			}
			
			int temp = 74;
			
			if (temp>75) {
				System.out.println("I will go for a walk");
			}else 
				System.out.println("I am going to study Java");
			
			System.out.println("-----------------");
			
			char gender = 'f';
			
			if (gender=='f') {
				System.out.println("you like shopping"); }
			else {
				System.out.println("You like watching sports");
			}
			
			System.out.println("-----------------");
			
			char pass = 'p';
			
			if (pass=='f') {
				System.out.println("It means the student studies with commitment"); }
			else {
				System.out.println("It means the student did not study enough");
			}
			
			String browser="chrome";
			
			if (browser.equals("chrome")) {
				
				System.out.println("All test cases will be executed on chrome");
				
			}
			else { System.out.println("i am not executing any test cases");
			}
			
			String studyhard="studyhard"; {
				if (studyhard.equals("nope")) {
				
					System.out.println("I will pass");
			}
				else {System.out.println("I wil fail");
			}
				
			}
			
			}
			
			
	}

