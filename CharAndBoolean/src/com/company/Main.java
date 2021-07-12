package com.company;

public class Main {

    public static void main(String[] args) {
	    char myChar= 'D'; // 16 bits or 2 bytes
        char myUnicode = '\u0044'; //unicode for character 'D'
        char myCopyrightChar = '\u00A9'; //unicode for character '©'
        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOver21 = true;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
        System.out.println(isCustomerOver21);
    }
}
