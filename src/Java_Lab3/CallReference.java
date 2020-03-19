/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Lab3;

/**
 *
 * @author MCALAB01020
 */
import java.util.*;
public class CallReference 
{
    int x;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  value");
        x=sc.nextInt();       
    }
    void swap(CallReference  r1,CallReference  r2)
    {
        int temp;
        temp=r1.x;
        r1.x=r2.x;
        r2.x=temp;
        System.out.println("AFter Swapping = " + r1.x + " and " + r2.x);
    }
    public static void main(String args[])
    {
        CallReference r1=new CallReference();
        System.out.println("Values of First Object:");
        r1.read();
        CallReference r2=new CallReference();
        System.out.println("Values of Second Object:");
        r2.read();
        CallReference r3=new CallReference();
        r3.swap(r1, r2);
    }
}
