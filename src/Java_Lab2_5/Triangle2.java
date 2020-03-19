
package Java_Lab2_5;

import java.util.*;

public class Triangle2 
{
   public static void main(String ar[])
    {
        int i,j,r;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row value");
        r=sc.nextInt();
        System.out.println("Triangle");
        for(i=r;i>=0;i--)
        {
            for(j=i;j<=r;j++)
            { 
                System.out.print("\t"+j); 
            }
            System.out.println();
        }
    }
}
