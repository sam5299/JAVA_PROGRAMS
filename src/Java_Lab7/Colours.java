/*Program for  a class called ColourChecking. Define a color with red = 193, green=255 
and blue = 183. No separate the rgb values. Find the Hue, saturation and brightness of this color.*/
package Java_Lab7;
import java.awt. *;

public class Colours 
{
    //int  red = 193, green =255, blue = 183;
    public static void main(String arg [ ])     
    {    
        Color rgb, hsb;        
        rgb  = new Color (193,255,183);        
        int red, green, blue;       
        red  = rgb.getRed ( );       
        green  =  rgb.getGreen ( );      
        blue    =  rgb.getBlue ( );  
        float x [ ] = {0.0f,0.0f,0.0f};       
        rgb.RGBtoHSB(red, green, blue, x); 
        System.out.println ("RGB Combination"); 
        System.out.println ("Red : "+red+"Green: "+green+"Blue : "+blue); 
        System.out.println ("Hue : "+x[0]+ "Saturation: "+x[1] +  "Brightness: "+x[2]); 
        int r = rgb.HSBtoRGB (0.75f,0.2375f,0.95f);   
        System.out.println ("\n HSB Combination");   
        System.out.println(" Red, Blue and Green Combination  : "+ r);          
    }
}
