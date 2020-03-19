import java.util.*;

class Fibonacci
{
    int fibo(int num)
	{
		if (num < 0)
		{
			System.out.println("Fibonacci of negative number is not possible.");
		}
		if (num == 0)
		{
			return 0;
		}
		else if (num == 1)
		{
			return 1;
		}                                
		else
		{
			return(fibo(num - 1) + fibo(num - 2));
		}
	}
	public static void main(String args[])
	{
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the nth number in fibonacci series: ");
		int num=c.nextInt();
		Fibonacci fib=new Fibonacci();
		int f=fib.fibo(num);		
		System.out.println(f);
	}

}