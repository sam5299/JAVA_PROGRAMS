
package Java_Lab2_9;


import java.util.*;
public class MatrixAddition 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,row,col;

        System.out.println("Enter the number of rows and columns of matrix");
        row = sc.nextInt();
        col = sc.nextInt();

        int first[][]= new int[row][col];
        int second[][]=new int[row][col];
        int sum[][]= new int[row][col];

        System.out.println("Enter the elements of first matrix");

        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                first[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of second matrix");

        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                second[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                sum[i][j] = first[i][j] + second[i][j]; 
            }
        }
        System.out.println("Sum of the matrices:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
