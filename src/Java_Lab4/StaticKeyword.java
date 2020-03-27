
package Java_Lab4;
import java.util.*;
public class StaticKeyword 
{
    static int x=100; //static variable => accessed by methods,static methods,static block 
    int y; //Accessed by methods only
    static  //Creates while loading a program
    {
        System.out.println("x value before creating object="+StaticKeyword.x);
        
        System.out.println("Static block");
        x=5;
        System.out.println("x value="+x);
    }
    static void staticmethod()
    {
        System.out.println("Static Method");
        x=10;
        System.out.println("x value="+x);
    }
    void display()
    {
        x=15;
        y=20;
        System.out.println("Display  Method");
        System.out.println("x value="+x);
        System.out.println("y value="+y);
    }
    public static void main(String args[])
    {
        ///System.out.println("x value before creating object="+x);
        
        StaticKeyword sk=new StaticKeyword ();
        StaticKeyword.staticmethod();
        sk.display();
        
    } 
}
