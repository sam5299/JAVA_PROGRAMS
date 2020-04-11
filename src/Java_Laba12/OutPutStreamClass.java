/*
 a program to create a file and write data into it using the methods OutputStream class. 
*/
package Java_Laba12;

import java.io.*;
public class OutPutStreamClass 
{
    public static void main(String args[])
    {
        try
        {    
             FileOutputStream f=new FileOutputStream("C:Java\\Write.txt");    
             String s="Welcome";    
             byte b[]=s.getBytes(); 
             f.write(b);    
             f.close();    
             System.out.println("File Created And Write Successfully");    
        }
        catch(Exception e)
            {
                System.out.println(e);
            }    
            
    }

}
