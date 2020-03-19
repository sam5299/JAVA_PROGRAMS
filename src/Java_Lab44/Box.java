
package Java_Lab44;

import java.util.*;

public class Box 
{
    int l,b;
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of l");
        l=s.nextInt();
        System.out.println("enter value of b");
        b=s.nextInt();
       
    }
    void display()
    {
        System.out.println("Area of rectangle  is : "+(l*b));
    }
}
class SuperKeyword extends  Box
{
    Scanner s=new Scanner(System.in);
    int he;
    void read()
    {
    super.read();
    System.out.println("enter value of h");
     he=s.nextInt();
   
    }
    void area()
    {
        int a=he*super.b*super.l;
    System.out.println("Area of Box is : "+a);
    display();
    }
    public static void main(String args[])
    {
        SuperKeyword b=new SuperKeyword();
        b.read();
        b.area();
       
    }
}
