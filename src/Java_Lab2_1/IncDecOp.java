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
public class IncDecOp 
{
    public static void main(String args[])
	{
		int ix,iy;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X value");
		ix=sc.nextInt();
		System.out.println("Enter the Y value");
		iy=sc.nextInt();
		ix++;
		iy++;
		System.out.println("X="+ix);
		System.out.println("Y="+iy);
		ix--;
		iy--;
		System.out.println("X="+ix);
		System.out.println("Y="+iy);
	}
    
}
