/* An outer class with a function display, again create another class inside the outer class named inner with a function 
called display and call the two functions in the main class. */

package Java_Lab6;

import java.util.*;

public class Outer 
{
    void display()
    {
        System.out.println("Outer class");
        Inner i=new Inner();
        i.display();
    }
    class Inner
    {
        void display()
        {
            System.out.println("Inner class");
        }
    }
    public static void main(String a[])
    {
       Outer o=new Outer();
       o.display();
       //o.display();
    }
}
