
package Java_Lab4;

import java.util.*;

public class MethodOverride 
{
    int a,b;
    void display()
    {
        a = 10;
        b = 20;
        System.out.println ("Base class value of a and b = "+a+" , "+ b);
    }
}
class Override extends MethodOverride
{
    int k;
    void display()
    {
        super.display();
        a = 30;
        b = 40;
        k=50;
        System.out.println ("value of a and b == "+a+" , "+ b);
        System.out.println ("value of k = "+k);
    }
}
class Overridden
{
    public static void main (String args[])
    {
        Override o=new Override();
        o.display();
    }
}

