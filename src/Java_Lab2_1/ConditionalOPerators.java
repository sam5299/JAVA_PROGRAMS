
package Java_Lab2_1;
import java.util.*;

public class ConditionalOPerators 
{
    public static void main(String args[])
    {
        int x;
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        x=sc.nextInt();        
        y=sc.nextInt();
        int z=x>y?x:y;
        System.out.println("Greatest is "+z);
    }
}
