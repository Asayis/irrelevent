package com.syntax.class11;

public class task3 {

	public static void main(String[] args) {
		

		int [][] arr = { {10, 15,10},
				{20, 50, 20},
				{30 ,30, 30, 30}};

		/*
		 * System.out.println(arr[0][0]); System.out.println(arr[0][1]);
		 * System.out.println(arr[0][2]); System.out.println(arr[1][0]);
		 * System.out.println(arr[1][1]); System.out.println(arr[1][2]);
		 * System.out.println(arr[2][0]); System.out.println(arr[2][1]);
		 * System.out.println(arr[2][2]); System.out.println(arr[2][3]);
		 */
		int sum=0;
		for (int j=0; j<arr.length; j++) {
			System.out.println(j);
		
		for (int i=0; i<3; i++) {
			sum = arr [j][i];
		}
		
	}
	}
}


