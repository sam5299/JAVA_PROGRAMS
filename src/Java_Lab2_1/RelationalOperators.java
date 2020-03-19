
package Java_Lab2_1;
import java.util.*;
public class RelationalOperators 
{
    public static void main (String args [ ] )
    {
        int inum1,inum2;
        
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the 2 numbers ");
       inum1=sc.nextInt();
       inum2=sc.nextInt();
       if(inum1>inum2)
       {
            System.out.println(inum1+"is greater");
       }
       else
       {
           
            System.out.println(inum2+" is greater");
       }
       if(inum1<inum2)
       {
            System.out.println(inum1+" is lesser");
       }
       else
       {
           
            System.out.println(inum2+" is lesser");
       }
       if(inum1==inum2)
       {
            System.out.println(inum1+" and "+inum2+" are equal");
       }
       if(inum1!=inum2)
       {
            System.out.println(inum1+" and "+inum2+" are not equal");
       }
       if(inum1>=inum2)
       {
            System.out.println(inum1+" is greater or eqaul to "+inum2);
       }
       if(inum1<=inum2)
       {
            System.out.println(inum1+" is lesser or eqaul to "+inum2);
       }
      
 } 
}
