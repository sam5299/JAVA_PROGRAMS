
package Java_Lab2_2;

import java.util.*;


public class DoStatement 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit ");
        int limit,i;
        limit=sc.nextInt();
        i=1;
        do
        {
            System.out.println("Values of i "+i);
            i++;
        }
        while(i<=limit);
    }
    
}
