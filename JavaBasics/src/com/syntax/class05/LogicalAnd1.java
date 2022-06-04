package com.syntax.class05;

public class LogicalAnd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean job = true;
		double salary = 1000000;
		
		if (job && salary >100000) {
			System.out.println("OMG! I MADE 100000000... THE TAX ON THIS IS MAD!");
			
		}  
		System.out.println("-----------------------------");
		
		boolean study = true;
		boolean homework = true;
		boolean practice = true;
		boolean MyBoss = false;
		
		if (study && homework && practice && MyBoss) {
			System.out.println(" you will succeed in the course");
		} else {
			System.out.println("you will struggle");
			
		}
		

	}

}
