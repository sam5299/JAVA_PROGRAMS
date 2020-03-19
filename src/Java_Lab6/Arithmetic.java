
package Java_Lab6;
import java.util.*;
interface test
{
    //final 
    void square(int a);
}
public class Arithmetic implements test
{
    public void square(int a)
    {
        System.out.println("Square is .."+a*a);
    }
}
class ToTestInt
{
     public static void main(String a[])
    {
        Arithmetic ar=new Arithmetic();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value"); 
        int add=sc.nextInt();
        ar.square(add); 
    }
      
}
