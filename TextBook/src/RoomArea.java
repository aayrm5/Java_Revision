import java.util.Scanner;

public class RoomArea {
    public static void main(String[] args){

        float area;
        Room room1 = new Room();

        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        room1.getdata(length,breadth);
        area = room1.length * room1.breadth;
        System.out.println("Area =" + area);
    }
}

class Room {
    float length;
    float breadth;
    void getdata(float l, float b){
        length = l;
        breadth = b;
    }
}
