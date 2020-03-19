
package    Java_Lab2_2;

import java.util.Scanner;
import java.util.*;
public class IfStatement 
{
       public static void main(String args[]) 
       {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        number=sc.nextInt();        
        	if (number > 0) 
                {
        		System.out.println("Number is positive.");
        	}
                else
                {
        		System.out.println("Number is Negative.");
        	}         
        }
    
}
