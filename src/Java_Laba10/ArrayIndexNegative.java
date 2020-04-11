/*
A program for example of try and catch block. In this check whether the given array size is negative or not. 
 
*/
package Java_Laba10;

import java.util.*;


public class ArrayIndexNegative 
{
    public static void main(String arg[])     
    { 
        Scanner sc = new Scanner(System.in);
        int limit;
        System.out.println("Enter the array limit");
        limit = sc.nextInt();
        try    
        {       
            int a[] = new int[limit];
            System.out.println(" Enter the Array Elements : ");
            for(int i=0;i<limit;i++)
            {
                a[i]= sc.nextInt();;
            }
            System.out.println(" Array Elements : ");   
            for(int i=0;i<limit;i++)
            {
                System.out.println(a[i]);
            }
        }      
        catch(NegativeArraySizeException na)        
        {          
            System.out.println(" generated exception : " + na);        
        }      
        System.out.println(" After the try block");    
        }  
}
