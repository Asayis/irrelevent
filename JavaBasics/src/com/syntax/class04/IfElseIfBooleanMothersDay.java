package com.syntax.class04;

public class IfElseIfBooleanMothersDay {

	
	// MAKE SURE YOU CHECK  THIS CCODE
	public static void main(String[] args) {
		
		System.out.println("-------1-------");
		
		boolean vaccine=true;
		if(vaccine) {
			System.out.println("Let me check if you have a second doses");
		}
	System.out.println("----------------");
	String month="May";
	int day=9;
	if (month.equals("May")) {
		System.out.println("Let me check what is today's date");
		if (day==9) {
			System.out.print("Today is Mother's day");
		
		}
	}else if(month.equals("June")) {
		System.out.println("today is Father's Day");
		
	}
}
}