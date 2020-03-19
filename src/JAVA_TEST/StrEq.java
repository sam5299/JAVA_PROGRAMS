package JAVA_TEST;
import java.util.*;
 class StrEqual 
{
    public static void main(String args[])
	{
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		str1=sc.next();
		System.out.println("Enter the second string:");
		str2=sc.next();
		if(str1.equals(str2))
		{
			System.out.println(" Strings are equal:");
		}
		else
		{
			System.out.println(" Strings are not equal:");
		}
		
		
	}
    
}
