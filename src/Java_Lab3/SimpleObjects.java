package Java_Lab3;

public class SimpleObjects 
{
    SimpleObjects()///default constructor
    {
        System.out.println("Default constructor");
    }
    SimpleObjects(int a)//parameterised constructor
    {
        System.out.println("One Argument Constructor");
        System.out.println(a);
    }
    SimpleObjects(int a,int b)//parameterised constructor
    {
        System.out.println("Two Argument Constructor");
        System.out.println(a+","+b);
    }
    public static void main(String args[])
    {
        SimpleObjects o1=new SimpleObjects();
        SimpleObjects o2=new SimpleObjects(10);
        SimpleObjects o3=new SimpleObjects(30,40);
    }
}