package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		boolean didRepl = true;

		int assignment = 19;

		if (didRepl) {
		

			if (assignment > 12)
				System.out.println(" great marks!");
			
			else if (assignment < 6)
				System.out.println("you failed");

			else if (assignment > 6 && assignment < 12)
				System.out.println("good marks");


			else
				System.out.println("top of your class mate");

		}
		
		else System.out.println("extra cirriculum to do your studies");

	}
}