import java.util.*;

class StudentTotalMark
{
	public static void main(String args[])
	{
		int age,i,j;
		float total=0;
		String name;
		int mark[]=new int[4];
		
		i=1;
		Scanner sc=new Scanner(System.in);	
		while(i<4)
		{
			System.out.println("Enter the student name:");
			name=sc.next();
			System.out.println("Enter the Age");
			age=sc.nextInt();
			
			System.out.println("Enter the 3 subjects Mark");
			for(j=1;j<=3;j++)
			{
				mark[j]=sc.nextInt();
				//System.out.println("Mark"+j+"="+ mark[i]);
				total=total+mark[j];
			}
			System.out.println("Name="+ name);
			System.out.println("Age="+ age);
			System.out.println("Total Mark="+ total);
			i++;
		}
	}
}			