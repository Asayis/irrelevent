package com.syntax.class03;

public class PrimitivesCasting {
	
	public static void main(String[] args) {
		
		//https://stackoverflow.com/questions/17705906/quick-casting-shortcut-in-eclipse
		//https://dzone.com/articles/top-30-eclipse-keyboard-shortcuts-for-java-program-1
		
		int i=100;
		double d=100;
		
		System.out.println(i); // 100
		System.out.println(d); // 100.0
		
		/*
		 * Widening -- Converting a lower datatype to a higher datatype is known as widening.
		 * byte -> short -> char -> int -> long -> float -> double 
		 */
		
		/*
		 * Narrowing − Converting a higher datatype to a lower datatype is known as narrowing.
		 * double -> float -> long -> int -> char -> short -> byte
		 */
		long l = 10000;
		
		int x= (int) 99.99;
		System.out.println(x);
		
		int b = 130;
		System.out.println(b);
		
		
	}
	
}