/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author sajitha
 */
import java.util.*;
public class IfStatement 
{
       public static void main(String args[]) 
       {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        number=sc.nextInt();        
        	if (number > 0) 
                {
        		System.out.println("Number is positive.");
        	}
                else
                {
        		System.out.println("Number is Negative.");
        	}         
        }
    
}
