package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; //using '=' and '+' operators in this expression
        System.out.println("1 + 2 = " + result);
        int prevResult = result;
        System.out.println("previous result = " + prevResult);
        result = result - 1;
        System.out.println("3-1="+result);
        System.out.println("previous result = " + prevResult);

        result = result * 100;
        System.out.println("2*100 = " + result);

        result = result /5;
        System.out.println("200 / 5 = " + result);

        result = result % 6;
        System.out.println("40 % 6 = " + result); //remainder of 40/6 is 4.

        // result = result + 1;
        result++; // 4+1 = 5
        System.out.println("4 + 1 = " + result);

        result--; // 5-1 = 4
        System.out.println("5 - 1 = " + result);

        //result = result + 2;
        result += 2; // 4+2=6
        System.out.println("4+2 = "+result);

        //result = result * 10;
        result*= 10;
        System.out.println("6*10 = "+result);

        //result = result / 3
        result /= 3;
        System.out.println("60 / 3 = "+result);

        //result = result - 2
        result-=2;
        System.out.println("20-2 = "+result);

        //if-then statement
        boolean isAlien = false;
        if (isAlien != true){
            System.out.println("It is not an Alien");
            System.out.println("And I'm scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score");
        }

        int secondTopScore=60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        int anotherScore=95;
        if ((topScore > 90) || (anotherScore <= 90)) {
            System.out.println("Either or both of the conditions are TRUE");
        }
        //ternary operator a ? b : c
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("WasCar is True");
        }

    }
}
