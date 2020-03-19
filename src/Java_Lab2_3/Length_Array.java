
package Java_Lab2_3;

import java.util.*;


public class Length_Array 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int limit1,i,limit2;
        int arr1[];
        int arr2[];
        System.out.println("Enter the first array limit ");
        limit1=sc.nextInt();
        System.out.println("Enter the second array limit ");
        limit2=sc.nextInt();
        arr1=new int[limit1];
        arr2=new int[limit2];
        System.out.println("Length of 1st array="+arr1.length);
        System.out.println("Length of 2nd array="+arr2.length);

    }
}
