
package Java_Laba11;
import java.io.*;
public class RenameFile 
{
  public static void main(String args[])
  {       
        File f = new File("c:\\java","renamefile");  
        File f1 = new File("c:\\java\\Sajitha_S"); 
        if (f.exists())  
        {    
            System.out.println(f + " does exists.");
            System.out.println("Its size is" + f.length()+ "bytes"); 
            f.renameTo(f1);
            System.out.println("Renamed file name :" + f1 );  
            //System.out.println("deleting the renamed file"+f1);      
            //f.delete(); 
        }  
        else
            System.out.println(f +" does not exists"); 
   }           
}
