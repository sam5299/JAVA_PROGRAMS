
package Java_Lab2_5;

import java.util.*;

public class Triangle3 
{
    public static void main(String ar[])
    {
        int i,j,r;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row value");
        r=sc.nextInt();
        System.out.println("Triangle");
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=i;j++)
            { 
                System.out.print("\t"+j); 
            }
            System.out.println();
        }
    }
    
}
