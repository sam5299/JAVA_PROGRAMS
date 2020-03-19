package Java_Lab3;

import java.util.*;

public class CallValue 
{
    void add(int a,int b)
    {
        int sum=a+b;
        System.out.println("sum="+sum);
    }
    public static void main(String args[])
    {
        int x;
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        x=sc.nextInt();        
        y=sc.nextInt();
        CallValue c=new CallValue();
        c.add(x,y);
    }
}