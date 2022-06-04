package com.syntax.class08;

public class LoopPractice01 {

	public static void main(String[] args) {

		int sumEven=0;
		int sumOdd=0;
		
		for (int i =1; i <= 70; i++) {
			if (i % 2 ==0) {
				sumEven+=1;
				
			} else {
				sumOdd+=1;
			}
			
			System.out.println(sumEven);
			System.out.println("---------------");
		System.out.println(sumOdd);	

		}	
		
	}

}
