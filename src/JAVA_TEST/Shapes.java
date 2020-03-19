
package JAVA_TEST;


import java.util.*;

public class Shapes 
{
   int a,r,h,l,b,h1;
   void volume(int s)
   {
       a=s;
       //int v=a*a*a;
       //System.out.println(v);
       System.out.println("Volume of a cube="+(a*a*a));
   }
   void volume(int ra,int he)
   {
       r=ra;
       h=he;
       System.out.println("Volume of a cylinder="+(3.14*r*r*h));
   }
   void volume(int le,int be,int he)
   {
       l=le;
       h1=he;
       b=be;
       System.out.println("Volume of a ccuboid="+(l*b*h));
   }
   public static void main(String args[])
   {
      Shapes s=new Shapes();
      s.volume(4);
      s.volume(2,5);
      s.volume(4,3,2);
   }
}
