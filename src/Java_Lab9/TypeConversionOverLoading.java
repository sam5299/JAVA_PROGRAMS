/*9.1
 A program to create automatic type conversions apply to overriding. 
*/
package Java_Lab9;
import java.util.*;
public class TypeConversionOverLoading 
{
    int sum=0;
    void Sum()
    {
        System.out.println ("No parameters" );
        System.out.println ("Sum="+sum );
    }
    void Sum (int a, int b)
    {
        System.out.println ("with  parameters" );
        sum=a+b;
        System.out.println ("Sum="+sum );
    }
    void Sum (double a,double b)
    {
        System.out.println ("Sum="+(a+b));
    }
    void Sum (double a,int b)
    {
        System.out.println ("Sum="+(a+b));
    }
 }
 class Overload
 {
    public static void main (String args[])
    {
        TypeConversionOverLoading obj = new TypeConversionOverLoading();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the an integer value ");
        int a=sc.nextInt();
        System.out.println("Enter the  an integer  value");
        int b=sc.nextInt();
        obj.Sum();
        obj.Sum((double)a,(double)b);
        obj.Sum((double)a,b);
 
    }
} 

