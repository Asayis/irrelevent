package com.syntax.class11;

public class task4 {

	public static void main(String[] args) {
		
		
		int [][] arr= { {10,15,10},
		        {20,50,20},
		        {30,30,30}};
		
			for(int j=0; j<arr.length;j++) {
			
			for(int i=0;i<arr[j].length; i++) {
				if(arr[j][i]%2==0) {
					System.out.println(arr[j][i]);
				}
			}
			
		}
	}
		
}

	

