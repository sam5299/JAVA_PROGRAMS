
package Java_Lab2_2;
import java.util.*;
public class SwitchStatement 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Days of a week");
        System.out.println("Enter Option ");
        int ch;
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println ("Sunday");
             break;
            case 2:
                System.out.println ("Monday");
            break;
            case 3:
                System.out.println ("tuesday");
             break;
            case 4:
                System.out.println ("Wednesday");
            break;
            case 5:
                System.out.println ("Thursday");
             break;
            case 6:
                System.out.println ("Friday");
            break;
             case 7:
                System.out.println ("Saturday");
            break;
            default:
                System.out.println ("......Invalid Option......");
        }
    } 
}
