
package Java_Lab2_7;

import java.util.*;

public class QuadraticEquation 
{
    public static void main(String args[])
    {
      double Root1=0,Root2=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a ::");
      double a = sc.nextDouble();

      System.out.println("Enter the value of b ::");
      double b = sc.nextDouble();

      System.out.println("Enter the value of c ::");
      double c = sc.nextDouble();

      double x = (b*b)-(4*a*c);
      double sqrt = Math.sqrt(x);

      if(x>0)
      {
         Root1= (-b + sqrt)/(2*a);
         Root2 = (-b - sqrt)/(2*a);
         System.out.println("Roots are :: "+ Root1 +" and "+Root2);
      }
      else if(x == 0)
      {
         System.out.println("Root is :: "+(-b + sqrt)/(2*a));
      }
   }

}
