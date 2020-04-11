/*10.4
A program to illustrate usage of try/catch with finally clause. 
*/
package Java_Laba10;

import java.util.Scanner;

public class TryCatchFinally 
{
     public static void main(String arg[])     
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  array limit :\t");
        int x1= sc.nextInt();
        try
        {
            int arr1[] =new int[x1];
            arr1[x1]=100;
        }
        catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.println(" generated exception : " + ai);   
        }
        catch(NegativeArraySizeException ne)
        {
            System.out.println(" generated exception : " + ne);   
        }    
        finally
        {
            System.out.println(" Finally Block : ");
        }
        System.out.println(" After the Finally block");    
    }
}
