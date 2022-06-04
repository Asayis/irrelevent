package com.syntax.class09;

public class HomeWork2 {

	public static void main(String[] args) {

		/*
			 Create an array of animals and store 5 elements into it. 
			 Using 2 different loops print all elements from the array.
		 */
		
		String[] animals = new String[6];

		animals[0] = "Arctodus";
		animals[1] = "African Lions";
		animals[2] = "Chinchilla";
		animals[3] = "Chipmunk";
		animals[4] = "Common Hippopotamus";
		animals[5] = "Common Lizard";
		
		
		for (int name = 0; name<animals.length; name++) {
			System.out.println(animals[name] + ", ");}
			
			System.out.println("-----------------");
			
		 String [] animilistic = {"Galapagos Penguin","Arctodus", "African Lions","Chinchilla", "Common Hippopotamus", "Galapagos Red Footed Booby Bird"};
		for(String animilove:animilistic) {System.out.print(animilove+", ");}

	}

}
