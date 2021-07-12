package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(isPrime(20));
        int count = 0;
        for(int i=10;i<50;i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number "+i+"is a prime number");
                if(count==10){
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<=n/2; i++){ //you could use square root of n to optimize the finding of prime number.
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


}
