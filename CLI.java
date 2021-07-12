import java.io.*;
import java.lang.*;

public class CLI {
    public static void main(String []args){
        String name, rollno, department;
        name = args[0];
        rollno = args[1];
        department = args[2];
        System.out.println("The Student details are:");
        System.out.println("Name:"+ name +"\nRoll No.:"+ rollno +"\nDepartment:" + department);
    }
}
