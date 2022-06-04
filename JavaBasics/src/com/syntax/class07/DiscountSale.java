package com.syntax.class07;

import java.util.Scanner;

public class DiscountSale {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);	
		System.out.println("Enter value for sale");
		boolean sale=input.nextBoolean();
		
		if (sale) {
			System.out.println("What do you want to purchase?");
			String item=input.next();
			System.out.println("How much is your item?");
			double price=input.nextDouble();
			
			double endValue=(price*0.1)+price;
			double percentage=0.1;
			
		    if (price<20) {
		    	endValue=(price*0.1)+price;
		    	percentage=0.1;
		    	
		    }else if (price>=20 && price<=100) {
		    	endValue=price-(price*0.2);
		    	percentage=0.2;
		   
			}else if (price>100 && price<=500) {
		    	endValue=price-(price*0.3);
		    	percentage=0.3;
		   
			}else endValue=price-(price*0.5);
		    percentage=0.5;
		   
		    System.out.println("After discount of "+ percentage +" the price of the item is reduced from " + price+ " to "+endValue);
		 }
		else System.out.println("No shopping for you mate");
		
	}
		
	}