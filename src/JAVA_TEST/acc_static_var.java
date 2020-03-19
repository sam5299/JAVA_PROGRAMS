import java.util.*;

class Account
{
	static double total=2000;
	int acc_no;
	String name;
	double amount=1000;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the acc_no");
		acc_no=sc.nextInt();
		System.out.println("Enter the acc_holder name");
		name=sc.next();
	}
	void deposite()
	{
		double d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter deposite amount");
		d=sc.nextDouble();
		amount=amount+d;
		total=total+amount;
		System.out.println("Acccount total amount after deposite"+amount);
	}
	void withdraw()
	{
		double w;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter withdraw amount");
		w=sc.nextDouble();
		if(w<amount)
		{
			amount=amount-w;
			total=total-amount;
			System.out.println("Account total amount after withdraw"+amount);
		}
	}
	
	static void display(Account a1,Account a2)
	{
		//System.out.println("Acc_no"+acc_no);
		//System.out.println("Name="+name);
		total=total+a1.total+a2.total;
		System.out.println(" total amount"+Account.total);
	}
	void display1(Account a)
	{
		System.out.println("Acc_no"+acc_no);
		System.out.println("Name="+name);
	}
	public static void main(String args[])
	{
		System.out.println(total);
		Account a=new Account();
		a.read();
		
		a.deposite();
		//Account.display();
		a.withdraw();
		a.display1(a);
		//a.display();
		Account a1=new Account();
		a1.read();
		
		a1.deposite();
		//a.display();
		a1.withdraw();
		a1.display1(a1);
		//Account.display();
		Account a2=new Account();
		a2.read();
		
		a2.deposite();
		//a.display();
		a2.withdraw();
		a2.display1(a2);
		//Account.display();
		a.display(a1,a2);
		//double t=a.total+a1.total+a2.total;
		//System.out.println(" total "+total);
		
	}
}
		

		
		
		