import java.io.*;
//import java.lang.*;
import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args){
        System.out.println("Enter the Radius of the Circle:");
        
        Scanner sr = new Scanner(System.in);
        int r = sr.nextInt();

        Area a = new Area(); 
        double ac = a.calculateArea(r);

        System.out.println("The area of circle of radius "+r+" is "+ac);
    }
}

public class Area{
    public double calculateArea(int r){
        double area;
        area = 3.14*r*r;
        return area;
    }
}