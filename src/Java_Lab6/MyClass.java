/* program to create interface A in this interface we have two method meth1 and meth2. 
Implements this interface in another class named MyClass.*/
package Java_Lab6;

import java.util.*;

interface A
{
    int inum1=20,inum2=10;//final 
    void meth1();
    void meth2();
}
public class MyClass implements A
{
    public void meth1()//definition
    {
        //int inum1,inum2;
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values for addition ");
        //inum1=sc.nextInt();
        //inum2=sc.nextInt();
        System.out.println("Sum="+(inum1+inum2));
    }
    public void meth2()//definition
    {
        //int inum1,inum2;
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values for Subtraction");
        //inum1=sc.nextInt();
        //inum2=sc.nextInt();
        System.out.println("Sub="+(inum1-inum2));
    }
    public static void main(String a[])
    {
       MyClass m=new MyClass();
       m.meth1();
       m.meth2();
    }
}
