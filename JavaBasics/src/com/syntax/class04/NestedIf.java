package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = false;
		int dose = 1;

		if (vaccine) {
			System.out.println("you need 1 more shot");
			
			if (dose ==1) {System.out.println("let me check how many doses you have");;}
		}
		else {
			System.out.println("you are fully vaccinated");
		}

		System.out.println("--------------------------------------------------------------");
		
		String month="June";
		int day=8;
		
		if (month.equals ("May")) {
			System.out.println("Let me check what is today's date");
			
			if (day==7) {
				System.out.println("Today is Mother's day");
			}
			
			else if (month.equals("June")); {
				System.out.println("let me check day in June");
				}
		
				if (day==19);
				System.out.println("Today is a Father's day");
		}
		
		
		
	}
}
