package com.company;

public class Main {

    public static void main(String[] args) {
	String myString = "This is a string"; //Strings are immutable; they get rewritten.
	System.out.println("myString is equal to " + myString);
	myString = myString + ", and This is more";
	System.out.println("myString is equal to " + myString);
	myString = myString + "\u00A9 2019";
	System.out.println("myString is equal to " + myString);
	String numString = "250.55";
	numString = numString + "49.95";
	System.out.println(numString);
	String lastString = "10";
	int myInt = 50;
	lastString = lastString + myInt;
	System.out.println("Last String is equal to "+lastString);
	double doubleNum = 120.47d;
	lastString = lastString + doubleNum;
	System.out.println("Last String is equal to "+lastString);
    }
}
