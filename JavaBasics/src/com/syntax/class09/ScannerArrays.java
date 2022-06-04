package com.syntax.class09;

import java.util.Scanner;

public class ScannerArrays {

	public static void main(String[] args) {
		
		
String[] classMateName=new String[5];
		
		Scanner input = new Scanner(System.in);
		classMateName[0]="Adem";
		classMateName[1]="Rami";
		classMateName[2]="Mumtaz";
		classMateName[3]="Selda";
		classMateName[4]="Duran";
		
		System.out.println("Pick a random number from 0 to 4!");
		int ClassMate=input.nextInt();
		
		System.out.println(classMateName[ClassMate]);

	}

}
