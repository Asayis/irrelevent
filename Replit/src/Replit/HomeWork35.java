package Replit;
import java.util.Scanner; 
public class HomeWork35 {
public static void main(String[] args) {
		
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Do you need a loan?");
		   boolean loan=scan.nextBoolean();
		   String eligibility="eligibility";

		    
		   if (loan) {System.out.println("What is your credit score?");
		    int creditScore=scan.nextInt();
		   if(creditScore<600){
		      eligibility="Not eligible";
		  
		     }else if (creditScore>=600 && creditScore<=700){
		      eligibility="Maybe eligible";
		     }else if (creditScore>=701 && creditScore<=800){
		      eligibility="eligible";
		     }else if (creditScore>=801)
		       eligibility="Definitely eligible";    
		     }else eligibility="Unknown";
		 System.out.println("The eligibility is "+eligibility);
		
	}
	}

