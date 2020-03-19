
package Java_Lab6;
import java.util.*;
public class MultipleInheritance 
{
        int s,sub;
}
class Opertions extends MultipleInheritance
{
    public int add(int a, int b)
    {
        s=a+b;
        return(s);
    }
    public int sub(int a, int b)
    {
        sub=a+b;
        return(sub);
    }
    public static void main(String args[])
    {
        Opertions ui = new Opertions();
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values for addition & subtraction ");
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=ui.add(a,b);
        int sub=ui.sub(a,b);
        System.out.println("Sum=" +sum);
        System.out.println("Sub=" +sub);
    } 
}
