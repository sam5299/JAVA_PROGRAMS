/*8.1
A  class point with following instance variable and methods. 
Instance variable:  private int x,y Constructors  :   public Point(), Point(int x, int y)  
Methods : public void setX(int x), setY(int y), setXY(int x, int y) 
*/
package Java_Lab8;


public class Point 
{
    private int x,y;
    public Point()
    {
        x=0;
        y=0;
        System.out.println( "Default Constructor :\nX= "+ x);
        System.out.println( "Y = "+y);
    }
    Point(int x, int y)
    {
        
        super();
        this.x=x;
        this.y=y;
        System.out.println( "Two argument Constructor : \nX= "+ x);
        System.out.println( "Y = "+y);
    }
    public void setX(int x)
    {
        x=100;
        System.out.println( "setX method :\nX= "+ x);
        
    }
    int setY(int y)
    {
        return y++; 
    }
    int setXY(int x, int y) 
    {
        x=x+y;
        return x;
    }
    public static void main(String args[]) 
    {
        int a=20,b=50;
        Point p;
        p=new Point();
        p=new Point(a,b);
        p.setX(a);
        int z=p.setY(b);
        int q=p.setXY(a,b);
        System.out.println( "values of \nX = "+p.x);
        System.out.println( "Y = "+p.y);
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter two numbers");
        //number=sc.nextInt(); 
    }
}
