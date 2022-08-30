package Labs;
import TurtleGraphics.*;
import java.lang.*;
import java.util.*;
public class FourLeafRose
{
    public static void main (String [] args)
    {
        double pi = Math.PI;
        double r = 0;
        double x = 0;
        double y = 0;
        StandardPen pen = new StandardPen();
        pen.up();
        pen.move(100,0);
        pen.down();
        for (double theta = 0; theta <= 2*pi;theta += (pi/50))//goes through 100 iterations from 0 to pi and calculates the x y and r coordinates then moves to those coords
        {
            r = Math.cos(2*theta);
            x = r*Math.cos(theta);
            y = r*Math.sin(theta);
            x*=100;
            y*=100;
            pen.move(x,y);
        
        
        
        }
    
    
    
    }
}
