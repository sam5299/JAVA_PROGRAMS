
package Java_Lab4;

import java.util.*;
public class A 
{
    int a,b;        
    
    void add()         
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println (" A + B = "+(a+b));          
    }
} 
class B extends A   
{   
    void sub()    
    {   
        System.out.println  ( " A - B == " +(a - b));  
    } 
 
    void mul()   
    {
        System.out.println  ( " A * B = "+a*b);     
    }
 } 
 
class Inherit    
{  
    public static void main (String args[]) 
    {     
        B a  = new B();
        a.add();
        a.sub();
        a.mul();  
        System.out.println("Value of a and B are " + (a.a +","+ a.b));
        double div=a.a/a.b;
        System.out.println  ( " A / B = "+(div));  
        System.out.println();
    }
}
