/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Lab2_5;

/**
 *
 * @author MCALAB01020
 */
import java.util.*;
public class Triangles 
{
    public static void main (String arg [ ] )
    {
        String k = "1", l = " ", s = "1";
        int m = 0;
        int n = 5; //* if necessary change the value of n** //
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < m; j++)
            {
                l+= "0";
            }
            System.out.println (k + l + s + "\n");
            l = "";
            m += 2;
        }
    }     
}
