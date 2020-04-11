/*
  A program to describe usage of throws clause. 
 */
package Java_Laba10;

public class ThrowsClause 
{
    static void throwOne() throws InterruptedException
    {
        System.out.println("Inside throwOne.");
        throw new InterruptedException();
    }
    public static void main(String args[]) 
    {
        try
        {
            throwOne();
        }
        catch(InterruptedException ie)
	{
            System.out.println(" Generated Exception : " + ie);
        }
    }
 }