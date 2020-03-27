
package Java_Lab4;

import java.util.*;
public class Room 
{
    int room_no;
    String room_type;
    String ac_machine;
    double room_area;
    void setdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter room number :\t");
        room_no=sc.nextInt();
        System.out.println("Enter room type :\t");
        room_type=sc.next();
        System.out.println("Enter room area :\t");
        room_area=sc.nextDouble();
        System.out.println("AC OR  NON AC :\t");
        ac_machine=sc.next(); 
    }
    void displaydata()
    {
        System.out.println("Room number :\t"+room_no);
        System.out.println("Room type :\t"+room_type);
        System.out.println("Room area :\t"+room_area);
        System.out.println("AC OR NON AC :\t"+ac_machine);
    }
    public static void main(String args[])
    {
        Room r=new Room();
        r. setdata();
        r.displaydata();
    }
    
}
