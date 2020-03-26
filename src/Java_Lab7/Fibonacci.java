/* Find the Fibonacci numbers are defined as F0=1,F1=1 and Fi=Fi-1+Fi-2 for i >2. */
package Java_Lab7;

import java.util.*;

public class Fibonacci 
{
    long fibo (int  n) 
    {  
        if (n<=1) 
            return 0;
        else if(n==2||n==3)
            return 1;
        else
            return (fibo(n-1)  + fibo (n-2) );
    }
    public static void main (String arg [ ]) 
    {
        Fibonacci f= new Fibonacci ( );
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term");
        int term=sc.nextInt();
        long num;
        num = f.fibo (term);
        System.out.println (term+"th Fibonacci number is : "+num); 
    }  
}
