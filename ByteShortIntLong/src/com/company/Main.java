package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue=10000;

        int myMinValue=Integer.MIN_VALUE;
        int myMaxValue=Integer.MAX_VALUE;

        System.out.println("Integer Min Value = " + myMinValue);
        System.out.println("Integer Max Value = " + myMaxValue);
        System.out.println("Busted MAX Value = " + (myMaxValue + 1 ));
        System.out.println("Busted MIN Value = " + (myMinValue - 1));

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte Min Value " + myMinByte);
        System.out.println("Byte Max Value " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short Min Value " +myMinShort);
        System.out.println("Short Min Value " +myMaxShort);
        
        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long = " +  myLongValue);
        System.out.println("Long Min Value " +myMinLong);
        System.out.println("Long Min Value " +myMaxLong);

        int myTotal = (myMinValue / 2);
        byte myNewByteValue = (byte) (myMinByte / 2); //casting
        short myNewShortValue = (short) (myMinShort / 2); //casting
        System.out.println(myTotal);
        System.out.println(myNewByteValue);
        System.out.println(myNewShortValue);
    }
}
