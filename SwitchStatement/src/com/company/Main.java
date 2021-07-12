package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue=6;

        switch(switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            // if break is not used, all the remaining case statements would run
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("actually it was a " + switchValue);
                break;
            default:
                System.out.println("was not 1,2,3,4,or 5");
                break; // optional in the default case statement.
        }
        //Challenge
        char charValue = 'D';
        switch(charValue){
            case 'A':
                System.out.println("Found the Character A");
                break;
            case 'B':
                System.out.println("Found the Character B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Found the Character "+ charValue);
                break;
            default:
                System.out.println("No Character has been found!");
                break;
        }
        String month = "JANUARY";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
