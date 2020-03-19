/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Lab2_1;

/**
 *
 * @author MCALAB01020
 */
import java.util.*;
public class BitwiseOperator 
{
    public static void main (String args [ ] )
    {
        int inum1,inum2;
        
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the 2 numbers ");
       inum1=sc.nextInt();
       inum2=sc.nextInt();
       System.out.println(" inum1 & inum2= "+ (inum1&inum2));
       System.out.println(" inum1 | inum2= "+ (inum1|inum2));
       System.out.println(" inum1 ^ inum2= "+ (inum1^inum2));
    }
}
