/*
 * Adesh Kumar
 * 9/28/21
 * DrawSquare_Student
 * Draws a square,rectangle, and triangle
 */



package TurtleGraphics;
import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare_Student
{
public static void main(String[] args)
{
    Random gen = new Random();
    StandardPen pen = new StandardPen();

    
    pen.up();
    pen.move(25);
    pen.turn(90); pen.move(25);
    pen.down();

    
    pen.setColor(Color.black);
    pen.move(130);
    pen.turn(90);
    pen.move(130);
    pen.turn(90);
    pen.move(130);
    pen.turn(90);
    pen.move(130);
    pen.move(130);
    pen.turn(135);
    pen.move(130.0/(1.41421356237));
    pen.turn(90);
    pen.move(130.0/(1.41421356237));
    pen.turn(45);
    pen.move(260);
    pen.turn(90);
    pen.move(130);
    pen.turn(90);
    pen.move(260);
    pen.turn(90);
    



}
}