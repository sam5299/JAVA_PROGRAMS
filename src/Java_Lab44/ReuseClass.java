/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Lab44;

import java.util.*;

public class ReuseClass 
{
    Room r=new Room();;//reuse the class roommm
    void createhouse()
    {
        r.setdata();
    }
    void displayhouse()
    {
        r.displaydata();
    }
    public static void main(String args[])
    {
        ReuseClass ru=new ReuseClass();
        ru. createhouse();
        ru.displayhouse();
    }
    
}
