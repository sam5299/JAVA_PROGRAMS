
package Java_Lab2_3;

import java.util.*;

public class MultiDimensional 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,row,col,col1;
        int a[][][];
        System.out.println("Enter the row value");
        row=sc.nextInt();
        System.out.println("Enter the column value ");
        col=sc.nextInt();
        System.out.println("Enter the column1 value ");
        col1=sc.nextInt();
        a=new int[10][10][10];
        System.out.println("Enter the array elements:");
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=col;j++)
            {
                for(k=1;k<=col1;k++)
                {
                    a[i][j][k]=sc.nextInt();
                }
            }
            
        }
        System.out.println("The Matrix elements:");
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=col;j++)
            {
                for(k=1;k<=col1;k++)
                {
                    System.out.print("\t"+a[i][j][k]);
                }
            }
           System.out.println(); 
        }
    }
}
