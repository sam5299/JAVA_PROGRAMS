
package Java_Lab2_7;

import java.util.*;
public class NumAscenOrder 
{
    public static void main(String args[])
    {
        int i,j,limit,temp;
        int a[]=new int[10];
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        limit=sc.nextInt();
        System.out.println("Enter the elements");
        for(i=1;i<=limit;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Elements in Ascending order");
        for(i=1;i<=limit;i++)
        {
            for(j=i;j<=limit;j++)
            {
               if(a[i]>a[j])
               {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
            }
        }
        for(i=1;i<=limit;i++)
        {
            System.out.print("\t"+a[i]);
        }
        System.out.println( );
    }
}
