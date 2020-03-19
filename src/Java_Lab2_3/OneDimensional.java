
package Java_Lab2_3;

import java.util.*;

public class OneDimensional 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit ");
        int limit,i;
        int a[];
        limit=sc.nextInt();
        a=new int[10];
        System.out.println("Enter the array elements:");
        for(i=1;i<=limit;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The array elements:");
        for(i=1;i<=limit;i++)
        {
            System.out.println(a[i]);
        }
    }
}
