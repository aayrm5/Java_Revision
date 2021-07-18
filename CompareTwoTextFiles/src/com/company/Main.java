package com.company;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader("D:\\__Riz__\\DS_600_NIELIT\\Java\\inputfile1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("D:\\__Riz__\\DS_600_NIELIT\\Java\\inputfile2.txt"));

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
            else if(! line1.equalsIgnoreCase(line2))
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
            System.out.println("Two files have different content. They differ at line "+lineNum);

            System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
        }
        reader1.close();
        reader2.close();

        System.out.println("\n");
        String s;
        int line=1;
        BufferedReader rdr1 = new BufferedReader(new FileReader("D:\\__Riz__\\DS_600_NIELIT\\Java\\inputfile1.txt"));
        while((s=rdr1.readLine())!=null)
        {

            if (line!=lineNum)
                System.out.println(s);
            else
                System.out.println(line);


            line+=1;
        }
    }
}

