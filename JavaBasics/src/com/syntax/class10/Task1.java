package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elements []= {65161,165165465,151,1651,5,66,666,777,2,1};
		int max=0;
		
		for (int sum=0; sum<elements.length; sum++) {
			if(elements[sum]>max) max=elements[sum];      }
         
		System.out.println(max);
		
		System.out.println("--------------");
		int a []= {10,9,8,7,6,5,4,3,2,1};
		int bigger=0;
		
		for (int b=0; b<a.length; b++) {
			if(a[b]>bigger) bigger=a[b];      }
		
		System.out.println("The largest number in the array is "+bigger);
		
		System.out.println("--------------");
        
		char x[]= {'a','b','c','d','e','f','g'};
		for(int y=6; y>=0; y--) {   System.out.print( x[y] );  
	}

}
}
