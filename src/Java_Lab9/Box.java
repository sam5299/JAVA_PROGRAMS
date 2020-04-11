/*9.2 Method Overriding
 Create class box and box3d. box3d is extended class of box.  The above two classes going to pull fill following requirement  
 Include constructor. set value of length, breadth, height.Find out area and volume. 
*/
package Java_Lab9;
import java.util.*;
public class Box 
{
    int lenght,breadth;
    Box(int l,int b)
    {
        lenght=l;
        breadth=b;
    }
    void area()    
    {
        System.out.println("Area of Box is : "+(lenght*breadth));
    }
    
}
class Box3d extends Box
{
    int height;
    Box3d(int h,int l,int br)
    {
        super(l,br);
        height=h;
    }
    void volume()
    {
        System.out.println("Volume of Box is : "+(lenght*breadth*height));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height ");
        int h=sc.nextInt();
        System.out.println("Enter the  length");
        int l=sc.nextInt();
        System.out.println("Enter the breadth"); 
        int br=sc.nextInt();
        Box3d b=new Box3d(h,l,br);  
        b.area();
        b.volume();
    }
}
