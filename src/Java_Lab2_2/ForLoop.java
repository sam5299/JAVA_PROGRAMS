
package Java_Lab2_2;

import java.util.*;

public class ForLoop 
{
  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit ");
        int limit,i;
        limit=sc.nextInt();
        for(i=1;i<=limit;i++)
        {
            System.out.println("Values of i "+i);
        }
    }
}
