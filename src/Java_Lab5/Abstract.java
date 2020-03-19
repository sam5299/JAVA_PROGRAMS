/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Lab5;

import java.util.*;

abstract public class Abstract 
{
    abstract void area();
    void display()
    {
        System.out.println("Area of Rectangle");
    }
}
class Rectangle extends Abstract
{
    int area;
    void area()
    {
        int l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        area=l*b;
    }
   void display()
   {
	System.out.println("Area="+area);
   }
   public static void main(String args[])
   {
	Rectangle obj = new Rectangle();
	obj.area();
        obj.display();
   }

}
