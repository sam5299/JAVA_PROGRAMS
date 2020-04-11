/*
A program for creation of user defined exception. 
 */
package Java_Laba10;

import java.util.Scanner;


public class UserdefinedException 
{
    public static void main(String arg[])     
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value of x :\t");
        int x=sc.nextInt();
        try
        {
             if(x%2!=0)
             {
                 throw new MyException();
                 
             }
        }
        catch(MyException me)
        {
            System.out.println(me); 
        }
    }
}
