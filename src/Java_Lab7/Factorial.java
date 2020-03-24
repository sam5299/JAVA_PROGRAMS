
package Java_Lab7;

import java.util.*;

public class Factorial 
{
    int fact (int n)      
    {
        if (n <= 1) 
            return 1;   
        else 
            return ( n * fact(n-1)); 
    }         
    public static void main  (String arg [ ])    
    {           
        int factnum1, factnum2,factnum3; 
   
        Scanner sc=new Scanner(System.in);
        Factorial f= new Factorial ( ); 
        System.out.println("Enter three numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        factnum1 = f.fact (num1);    
        factnum2 = f.fact (num2); 
        factnum3 = f.fact (num3);  
        System.out.println("Factorial of "+ num1 + " is " +factnum1 );        
        System.out.println ("Factorial of "+ num2 + " is " + factnum2);       
        System.out.println("Factorial of "+ num3 + " is " + factnum3); 
    }
}