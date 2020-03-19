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
public class BitwiseCompliment 
{
    public static void main (String args [ ] )
    {
        int inum1,inum2;
        
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the  number ");
       inum1=sc.nextInt();
       System.out.println("value="+inum1);
       inum2=~inum1;
       System.out.println("value="+inum2);
    }
}
