/*
 a program to get the input from the user and store it into file. Using Reader and Writer file. 
*/
package Java_Laba12;

import java.io.*;
import java.util.*;
public class ReaderWriter 
{
    public static void main(String args[]) throws IOException 
    {
        System.out.print("Enter the  a string :\t");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        try 
        {    
           FileWriter fw=new FileWriter("C:Java\\ReaderWriter.txt");    
           fw.write(str);    
           fw.close();    
          }
        catch(Exception e)
        {
            System.out.println(e);
        }    
        System.out.println("File write Successfully..."); 
        FileReader fr = null;
        int ch;
        try
        { 
            fr= new FileReader("C:Java\\ReaderWriter.txt.txt"); 
            while ((ch=fr.read())!= -1) 
            {
                System.out.print((char)ch);
            }
             fr.close();
        } 
        catch (Exception fe) 
        { 
            System.out.println("File not found"+fe); 
        } 
        System.out.println();
    }
}
