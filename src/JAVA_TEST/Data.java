class Data 
{
    byte b;
	short s;
	int i;
	long l;
	char ch;
	float f;
	double d;
	boolean bo;
	public static void main(String args[])
	{
		Data c=new Data();
		
		System.out.println("Byte="+c.b);
		System.out.println("Short="+c.s);
		System.out.println("Integer="+c.i);
		System.out.println("Long="+c.l);
		System.out.println("Character="+c.ch);
		System.out.println("Float="+c.f);
		System.out.println("Double="+c.d);
		System.out.println("Boolean="+c.bo);
	}
}
