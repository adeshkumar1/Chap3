import java.util.Scanner;
/**
   Prints the compas direction N,NE,E,SE,S,SW,W,NW
   Given an angle as input.
*/
public class CompassDirection
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the direction the compass is pointing " + "in degrees from North (0..360): ");
      double degrees = in.nextDouble();
      
      
      
      if (degrees < 22.5 || degrees > 337.5)
        System.out.println("North");
      else if (degrees > 22.5 && degrees < 67.5)
        System.out.println("North East");
      else if (degrees > 67.5 && degrees < 112.5)
        System.out.println("East");
      else if (degrees > 112.5 && degrees < 157.5)
        System.out.println("South West");
      else if (degrees > 157.5 && degrees < 202.5)
        System.out.println("South");
      else if (degrees > 202.5 && degrees < 247.5)
        System.out.println( "South West");
      else if (degrees > 247.5 && degrees < 292.5)
        System.out.println("West");
      else if (degrees > 292.5 && degrees < 337.5)
        System.out.println("North West");
      

      

      



   }
}
