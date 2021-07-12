package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1974));
        System.out.println(isLeapYear(-2000));
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(0));
        System.out.println(isLeapYear(10000));
        System.out.println(getDaysInMonth(2,2000));
        System.out.println(getDaysInMonth(2,2001));
        System.out.println(getDaysInMonth(5,2000));
        System.out.println(getDaysInMonth(6,2000));
        System.out.println(getDaysInMonth(5,2001));
        System.out.println(getDaysInMonth(6,2002));
        System.out.println(getDaysInMonth(12,2001));
        System.out.println(getDaysInMonth(-1,2000));
        System.out.println(getDaysInMonth(2,-2000));
    }

    public static boolean isLeapYear(int year){
        if((year<=0)||(year>=10000)){
            return false;
        }else{
            if((year%4==0 && year%100!=0 )|| (year%400==0)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            days=-1;
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                days = 31;
            } else if (month == 2) {
                if(isLeapYear(year)){
                    days = 29;
                }else{
                    days=28;
                }
            } else {
                days = 30;
            }
        }
        return days;
    }
}

