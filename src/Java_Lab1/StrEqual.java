/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Lab1;

/**
 *
 * @author MCALAB01020
 */
import java.util.*;
public class StrEqual 
{
    public static void main(String args[])
	{
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		str1=sc.next();
		System.out.println("Enter the second string:");
		str2=sc.next();
		if(str1.equals(str2))
		{
			System.out.println(" Strings are equal:");
		}
		else
		{
			System.out.println(" Strings are not equal:");
		}
		
		
	}
    
}
