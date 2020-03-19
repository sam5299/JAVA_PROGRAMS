
package Java_Lab2_2;

import java.util.*;

public class WhileStatement 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit ");
        int limit,i;
        int sum=0;
        limit=sc.nextInt();
        
        i=1;
        while(i<=limit)
        {
            sum=sum+i;
            i++;  
        }
        System.out.println("Sum of "+limit+" numbers = "+sum);
    }
}
