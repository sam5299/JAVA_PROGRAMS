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
public class ArithmeticOperator 
{
    public static void main(String args[])
    {
        int inum1,inum2,add,sub,mul;
        double div,mod;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers ");
        inum1=sc.nextInt();
        inum2=sc.nextInt();
        add=inum1+inum2;
        sub=inum1-inum2;
        mul=inum1*inum2;
        div=inum1/inum2;
        mod=inum1%inum2;
        System.out.println("Sum="+add);
        System.out.println("Sub="+sub);
        System.out.println("Mul="+mul);
        System.out.println("Div="+div);
        System.out.println("Mod="+mod);  
    }
    
}
