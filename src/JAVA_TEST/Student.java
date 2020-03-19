

import java.util.*;

public class Student 
{
    String name;
    int roll_no,age;
    float mark[]=new float[10];
    Student()
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student roll number :");
        roll_no=sc.nextInt();
        System.out.println("Enter 5 marks");
        for(i=1;i<=5;i++)
        {
            mark[i]=sc.nextFloat();
        }
       /* for(i=1;i<=5;i++)
        {
            System.out.println(mark[i]);
        }*/
    }
    Student(String n,int age)
    {
       
       name=n;
       this.age=age;
    }
    void display()
    {
        System.out.println("Student name = "+name);
        System.out.println("Age=" +age);
        System.out.println("ROll No = "+roll_no);
        
    }
   float total()
    {
        int i;
        float total_mark=0;
        for(i=1;i<=5;i++)
        {
           total_mark=total_mark+mark[i];
        }
        return total_mark;
        //System.out.println("Total marks = "+total_mark);
    }
   public static void main(String args[])
   {
       int age;
       String name;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the student name and age :");
       name=sc.next();
       age=sc.nextInt();
       Student s=new Student(name,age); 
       //s=new Student();  
       //float t=s.total();
       s.display();
       float t =s.total();
       System.out.println("Total marks = "+t);
   }
}
