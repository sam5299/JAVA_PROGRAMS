
package Java_Lab2_6;

import java.util.*;

public class SumDigit 
{
  public static void main (String args [ ] )      
  {        
      int n, s;   
      s=0;   
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
       n=sc.nextInt();
      //System.out.println (i);   
      while (n>10)     
      {     s=s+n%10;     
      n=n/=10;          
      }         
       s=s+n; 
        System.out.println ("the sum of the digits is :" + s);     
  }    
} 
