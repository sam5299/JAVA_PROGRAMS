import java.util.*;

class Details
{
	int age,m1,m2,m3;
	float tot=0;
	String name;
	//int mark[]=new int[4];
	//int i=1;
	
	void read()
	{
		Scanner sc=new Scanner(System.in);	
			System.out.println("Enter the student name:");
			name=sc.next();
			System.out.println("Enter the Age");
			age=sc.nextInt();
			System.out.println("Enter the 3 subjects Mark");
			m1=sc.nextInt();
			m2=sc.nextInt();
			m3=sc.nextInt();
	}
	void total()
	{
		tot=m1+m2+m3;
	}
	void display()
	{
		System.out.println("Name="+ name);
		System.out.println("Age="+ age);
		System.out.println("Total Mark="+ tot);
	}
}
class Student
{
	public static void main(String args[])
	{
		//float t;
		int j;
		Details d=new Details();
		for(j=0;j<3;j++)
		{
		d.read();
		d.total();
		d.display();
		}
	}
}