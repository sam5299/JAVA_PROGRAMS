
package Java_Lab5;

import java.util.*;

public class Shape 
{
    void draw()
    {
        System.out.println("Drawing Different Shapes");
    }
    void erase()
    {
        System.out.println("Erase the shapes");
    }
}
class Circle extends Shape 
{
    void draw()
    {
        System.out.println("Drawing Circle Shape");
    }
    void erase()
    {
        System.out.println("Erase circle shape");
    }
}
class Triangle extends Circle
{
    void draw()
    {
        System.out.println("Drawing Triangle Shape");
    }
    void erase()
    {
        System.out.println("Erase Triangle shape");
    }
}
class Square extends Triangle
{
  
    void draw()
    {
         System.out.println("Drawing Square Shape");
    }
    void erase()
    {
        System.out.println("Erase Square shape");
    }
    public static void main(String args[])
    {
        Shape sh,s,t,c;
        sh=new Shape();
        sh.draw();
        sh.erase();
        s=new Square();
        s.draw();
        s.erase();
        t=new Triangle();
        t.draw();
        t.erase();
        c=new Circle();
        c.draw();
        c.erase();
    }
}