package com.company;

public class Main {

    public static void main(String[] args) {
        double cm_calc = calcFeetAndInchesToCentimeters(5,7);
        System.out.println("Total calc cms : " + cm_calc);

        double cm_from_feet = calcFeetAndInchesToCentimeters(5.7);
        System.out.println("Toal CMS from Feet = " + cm_from_feet);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches <= 12 && inches >= 0)) {
            double total_inches = (feet*12)+inches;
            double cms = total_inches * 2.54;
            return cms;
        }
        else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet) {
        if (feet >=0) {
            double inches = feet * 12;
            double cms = inches * 2.54;
            return cms;
        }
        else {
            return -1;
        }
    }
}
