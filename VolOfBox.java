import java.io.*;
import java.lang.*;
import java.util.*;

public class VolOfBox{
    public static void main(String []args){
        BoxVolume obj = new BoxVolume(); 
        System.out.println("Enter length, breadth, height of the box");
        
        Scanner sr = new Scanner(System.in);
        int len = sr.nextInt();
        int br = sr.nextInt();
        int ht = sr.nextInt();
        obj.volcalc(len, br, ht);
    }
}

class BoxVolume{
    public void volcalc(int l, int b, int h){
        System.out.println("The Volume of the Box is:"+(l*b*h));
    }
}