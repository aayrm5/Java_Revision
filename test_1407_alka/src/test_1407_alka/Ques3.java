package test_1407_alka;
import java.util.*;
public class Ques3 {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		Scanner inObj = new Scanner(System.in);
		System.out.println("Enter your choice: ");
	    int choice = inObj.nextInt(); 
	    switch(choice)
	     { 
	    	case 1 : 
	    		System.out.println("Add elemnts in inventory");
	    		System.out.println("Enter no of items to be added");
	     
	    		int noOfObjects = inObj.nextInt();  
	    		for(int i=0;i<noOfObjects;i++) {
	    			System.out.println("Enter name of item");
	    			String s = inObj.next();
	    			al.add(s);
	    		}
	    		System.out.println("Enter your choice: ");
	    	    choice = inObj.nextInt(); 
	     	
	     	case 2 : 
	     		System.out.println("View elemnts in inventory");
	     		System.out.println("Contents of al: " + al);
	     		System.out.println("Enter your choice: ");
	    	    choice = inObj.nextInt(); 
	     	
	     	case 3: 
	     		System.out.println("Modify elemnts in inventory");
	     		System.out.println("Enter the item to delete");
	     		String s = inObj.next();
	     		al.remove(s);
	     		System.out.println("Inventory after deletion: " + al);
	     		System.out.println("Enter your choice: ");
	    	    choice = inObj.nextInt(); 	
	     	case 4: break;
	     	
	     }
		
		
		
}
}
