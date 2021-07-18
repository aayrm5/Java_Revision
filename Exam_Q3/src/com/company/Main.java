package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        Scanner inObj = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Inventory Management System ");
            System.out.println("1. Addition");
            System.out.println("2. view");
            System.out.println("3. Modify/Delete");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = inObj.nextInt();
            switch(choice)
            {
                case 1 :
                    System.out.println("Add elemnts in inventory");
                    System.out.println("Enter no of items to be added");

                    int noOfObjects = inObj.nextInt();
                    for(int i=0;i<noOfObjects;i++) {
                        System.out.println("Enter name of item");
                        String n = inObj.next();
                        System.out.println("Enter qty of item");
                        int q = inObj.nextInt();
                        hmap.put(n,q);
                    }
                    System.out.println("Enter your choice: ");
                    choice = inObj.nextInt();

                case 2 :
                    System.out.println("View elemnts in inventory");
                    System.out.println("Contents of hmap: " + hmap);
                    System.out.println("Enter your choice: ");
                    choice = inObj.nextInt();

                case 3:
                    System.out.println("Modify elemnts in inventory");
                    System.out.println("Enter the item to delete");
                    String s = inObj.next();
                    hmap.remove(s);
                    System.out.println("Inventory after deletion: " + hmap);
                    System.out.println("Enter your choice: ");
                    choice = inObj.nextInt();
                case 4:
                    System.out.println("Exiting ");
                    break;

            }

        }while(choice!=4);

        inObj.close();
    }
}
