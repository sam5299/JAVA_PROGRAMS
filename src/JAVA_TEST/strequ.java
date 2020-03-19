import java.util.*;

class StrEqual
{
	public static void main(String a[])
	{
		String str1,str2;
		int i,len,len1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		str1=sc.next();
		str2=sc.next();
		len=str1.length();
		len1=str2.length();
		
			if(str1.equals(str2))
			{
				System.out.println("Strings are Equal");
				System.out.println();
				System.out.println("First string = "+str1);
				System.out.println("Second string = "+str2);
			}
			else
			{
				System.out.println("Strings are Not Equal");
				System.out.println();
				System.out.println("First string = "+str1);
				System.out.println("Second string = "+str2);
			}
		
	}
}