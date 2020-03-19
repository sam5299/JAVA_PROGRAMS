
package Java_Lab2_5;

import java.util.*;

public class Triangle1 
{
    public static void main(String ar[])
    {
        int i,j,r,k;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row value");
        r=sc.nextInt();
        k = 1;
        System.out.println("Triangle");
        for(i=0;i<=r;i++)
        {
            for(j=1;j<=i;j++)
            {
           
                if (j==1||j==i)
                { 
                    k=1;
                }
                else
                {
                    k = 0;
                }
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
