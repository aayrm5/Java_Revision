package com.company;
import java.io.*;
import java.util.Scanner;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner inObj = new Scanner(System.in);
        System.out.println("Enter full path to the file to read the file1 : ");
        String fname1 = inObj.nextLine();
        FileReader fr1 = new FileReader(fname1);
        System.out.println("Enter full path to the file to read the file2 : ");
        String fname2 = inObj.nextLine();
        FileReader fr2 = new FileReader(fname2);

        System.out.println("Comparison");
        BufferedReader reader1 = new BufferedReader(new FileReader(fname1));
        BufferedReader reader2 = new BufferedReader(new FileReader(fname2));

        String line1 = reader1.readLine();
        String line2 = reader2.readLine();

        boolean areEqual = true;
        int lineNum = 1;

        while (line1 != null || line2 != null)
        {
            if(line1 == null || line2 == null)
            {
                areEqual = false;
                break;
            }
            else if(!line1.equalsIgnoreCase(line2))
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
            System.out.println("The two input files have different content. They differ at line "+lineNum);
            System.out.println("File1 has : "+line1+" ; and File2 has : "+line2+" at line "+lineNum);
        }

        reader1.close();
        reader2.close();
        System.out.println("\n");
        String s;
        int line=1;
        BufferedReader rdr1 = new BufferedReader(new FileReader(fname1));

        System.out.println("The lines that are same are: ");
        while((s=rdr1.readLine())!=null)
        {

            if(line != lineNum){
            System.out.println(s);
            }
            line+=1;
        }
        System.out.println("\n");
        System.out.println("------------End of Line---------------");
        rdr1.close();
        fr1.close();
        fr2.close();
        inObj.close();
    }
}
