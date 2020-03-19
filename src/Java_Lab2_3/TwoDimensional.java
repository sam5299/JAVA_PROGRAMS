/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Lab2_3;

import java.util.*;
public class TwoDimensional 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,row,col;
        int a[][];
        System.out.println("Enter the row value");
        row=sc.nextInt();
        System.out.println("Enter the column value ");
        col=sc.nextInt();
        a=new int[10][10];
        System.out.println("Enter the array elements:");
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=col;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("The Matrix elements:");
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=col;j++)
            {
                System.out.print("\t"+a[i][j]);
            }
           System.out.println(); 
        }
    }
}
