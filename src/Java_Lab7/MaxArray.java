
package Java_Lab7;

import java.util.*;

public class MaxArray 
{
    void Maximum(int a[], int low, int limit) 
    { 
       int max= a[0]; 
       int i; 
       for (i=low;i<=limit;i++) 
       { 
           if (a[i] > max) 
              max = a[i]; 
       } 
       System.out.println("Maximum element int the array is "+ max); 
    } 
    public static void main (String[] args)  
    { 
        int limit;
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array limit");
        limit=sc.nextInt();
        System.out.println("Enter "+ limit +" array elements");
        for (int i=1; i <=limit;i++) 
        {
            a[i]=sc.nextInt(); 
        }
        MaxArray ma=new MaxArray();
        ma.Maximum(a,1,limit); 
    }  
}
