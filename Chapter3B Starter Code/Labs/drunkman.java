package Labs;
import TurtleGraphics.*;
import java.lang.*;
import java.util.*;
import java.awt.*;


public class drunkman
{
   public static void main (String [] args)
   {
       StandardPen pen = new StandardPen();
       int x = 0;
       int angle = 0;
       Random gen = new Random();
       for (int i = 0;i<1000000;i++){
        x = gen.nextInt(4)+1;//generates the direction
        if (x == 1){
        
        pen.turn(90);
        pen.move(1);
        }
        else if (x==2){
        
        pen.turn(180);
        pen.move(1);
    }
       else if (x == 3) {
        
        pen.turn(270);
        pen.move(1);
    }
       else {
        
        pen.turn(360);
        pen.move(1);
    }
    }
   
     pen.setColor(Color.red);//sets color to red and draws line back to origin
     pen.move(0,0);
    
    
    
    }
}
