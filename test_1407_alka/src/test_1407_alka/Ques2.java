package test_1407_alka;

import java.util.Scanner;

public class Ques2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inObj = new Scanner(System.in);
		System.out.println("Enter principal amount");  
	    float principalAmount = inObj.nextFloat();  
	    System.out.println("Enter Rate of interest");  
	    float roi = inObj.nextFloat();  
	    roi = roi/100;
	    System.out.println("Enter time in years");  
	    int time = inObj.nextInt();  
	    
	    
	    float amount = principalAmount*(1+roi*time);
	    	    
	    float ci_amount = (float) (principalAmount*(Math.pow((1+roi),time)));
	    float emi;  
	    System.out.println("Enter your choice: ");
	    int choice = inObj.nextInt(); 
	    switch(choice)
	     {
	        case 1:
	        	System.out.println("Enter months");  
	    	    int months = inObj.nextInt();  
	    	    
	    	    emi = amount/(float)months;
	    	    System.out.println("For Simple interest - as per no of months, emi is :"+emi+" per month");
	    	    
	        case 2:
	        	System.out.println("Enter no of installments");  
	        	int NoOfInstallments = inObj.nextInt();  
    	    
	        	emi = amount/(float)NoOfInstallments;
	        	System.out.println("For Simple interest - as per no of installments, emi is :"+emi+ " per month");	    
    	    
	        case 3:
	        	System.out.println("Enter no of  years forinstallments");  
	        	int NoOfInstallmentsPerYear = inObj.nextInt();  
    	    
	        	emi = amount/(float)NoOfInstallmentsPerYear;
	        	System.out.println("For Simple interest - as per no of installments, emi is :"+emi+ " per year");
    	    
	        case 4: 
	        	System.out.println("Exit");
	        	break;
	        default:
	        	System.out.println("Default: Value is wrong: Reenter ");
	        	
	        	
	      }
	    
	}

}
