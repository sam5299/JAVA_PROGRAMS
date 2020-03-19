import java.util.*;

public class PrimeNumCheck 
{
    public static void main(String ar[])
    {
        int inum,i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        inum=sc.nextInt();
        for(i=2;i<=inum/2;i++)
        {
            if( (inum % i)==0 )
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(inum+" is a prime number");
        }
        else
           {
               System.out.println(inum+" is not a prime number");
           }
    }
}