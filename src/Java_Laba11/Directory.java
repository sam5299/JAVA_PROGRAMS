
package Java_Laba11;

import java.io.*;

public class Directory 
{
    public static void main (String args[]) throws IOException      
    {  
        File f = new File ("c:/java/temp");
        if (f.mkdir()) 
            System.out.println("created a directory"+f);
        else 
            System.out.println ("unable to create a directory"+f);  
    }  
} 