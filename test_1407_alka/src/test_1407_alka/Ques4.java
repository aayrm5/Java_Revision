package test_1407_alka;

import java.io.*;
import java.util.Scanner;

public class Ques4 {
	
	  public static void main(String[] args) throws Exception
	  {
	    Scanner inObj = new Scanner(System.in);
		System.out.println("Enter filename :"); 
		String fname1 = inObj.nextLine();
	    FileReader fr1 = new FileReader("C:\\Users\\alkat\\eclipse-workspace\\test_1207\\src\\test_1207\\" + fname1);
	    System.out.println("Enter filename 2 :"); 
		String fname2 = inObj.nextLine();
	    FileReader fr2 = new FileReader("C:\\Users\\alkat\\eclipse-workspace\\test_1207\\src\\test_1207\\" + fname2);
	    System.out.println("First file");
	    int i;
	    while ((i=fr1.read()) != -1)
	      System.out.print((char) i);
	    System.out.println("\n");
	    System.out.println("Second file");
	    int j;
	    while ((j=fr2.read()) != -1)
	      System.out.print((char) j);
	    System.out.println("\n");
	    System.out.println("Comparison");
	    BufferedReader reader1 = new BufferedReader(fr1);
        BufferedReader reader2 = new BufferedReader(fr2);
         
        String line1 = reader1.readLine();
        String line2 = reader2.readLine();
         
        boolean areEqual = true;
         
        int lineNum = 1;
        
                 
       while (line1 != null || line2 != null){
    	   if(line1 == null || line2 == null){
                areEqual = false;
                break;
            }
            else if(!line1.equals(line2))
            {
                areEqual = false;
                break;
            }
            line1 = reader1.readLine();
            line2 = reader2.readLine();
            lineNum++;
        }
         
        if(areEqual)
        {
            System.out.println("Two files have same content.");
        }
        else
        {
        	System.out.println("Output is 0");
            System.out.println("Two files have different content. They differ at line "+lineNum);            
            System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
            String s;
            int line=0;
    		while((s=reader1.readLine())!=null) {
    			line+=1;
    			if (line==lineNum)
    				continue;
    			else
    				System.out.println(s);
    		}			
        }
         
        reader1.close();
        reader2.close();
	  }
	}

