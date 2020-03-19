
package JAVA_TEST;

import java.util.*;

public class Distance 
{
    int feet,inches;
    
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the feet and inches");
        feet=sc.nextInt();
        inches=sc.nextInt();
    }
    void display(Distance d1,Distance d2)
    {
        System.out.println("Feet = "+d1.feet);
        System.out.println("Inches = "+d1.inches);
        System.out.println("Feet = "+d2.feet);
        System.out.println("Inches = "+d2.inches);
        System.out.println("Distance in feet= "+feet);
        System.out.println("Distance in inches= "+inches);

    }
    Distance add(Distance d2)
    {
        Distance da=new Distance();
        da.feet=feet+d2.feet;
        da.inches=inches+d2.inches;
        //Distance da=new Distance();
        return da;
    }
    Distance sub(Distance d2)
    {
        //int distf,disti;
        Distance ds=new Distance();
        ds.feet=feet-d2.feet;
        ds.inches=inches-d2.inches;
        //Distance ds=new Distance();
        return ds;
    }
    public static void main(String args[])
    {
      Distance d1=new Distance();
      d1.read();
      //d1.display(d1);
      Distance d2=new Distance();
      d2.read();
      Distance d3=new Distance();
      d3=d1.add(d2);
      d3.display(d1,d2);
      Distance d4=new Distance();
      d4=d1.sub(d2);
      d4.display(d1,d2);
   }
}
