import java.util.*;
public class IncDecOp 
{
    public static void main(String args[])
	{
		int ix,iy;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X value");
		ix=sc.nextInt();
		System.out.println("Enter the Y value");
		iy=sc.nextInt();
		ix++;
		iy++;
		System.out.println("X="+ix);
		System.out.println("Y="+iy);
		ix--;
		iy--;
		System.out.println("X="+ix);
		System.out.println("Y="+iy);
	}
    
}