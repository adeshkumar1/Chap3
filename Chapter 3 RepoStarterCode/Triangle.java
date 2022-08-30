
import java.util.*;

public class Triangle
{
    public static void main (String []args)
   {
       Scanner scan = new Scanner(System.in);
       int x,y,z;
       String option;
       
       System.out.println("Sides or Angles?");
       option = scan.nextLine();
       option = option.toLowerCase();
       
       if (option.equals("sides"))
       {
           System.out.println("Enter the side lengths of the triangle: ");
           x = scan.nextInt();
           y = scan.nextInt();
           z = scan.nextInt();
        
           if (!(x+y>z && x+z>y && y+z>x))//checks if triangle side lengths are valid 2 added should be greater than the other
               System.out.println("Triangle is not possible");
           else if (x <= 0 || y <= 0 || z <= 0)//checks for zero and nonzero values
               System.out.println("Triangle is not possible");
           else if ( x == y && y == z && x == z)//checks if equilateral
               System.out.println("Equilateral");
           else if ( x == y || y == z || x == z)//checks for iscoceles
               System.out.println("Isosceles");
           else //scalene if it doesn't fit any other option
               System.out.println("Scalene");
        }   
       
       else if (option.equals("angles"))
           
       {
    
           System.out.println("Enter the angles of the triangle");
           x = scan.nextInt();
           y = scan.nextInt();
           z = scan.nextInt();
           if (x+y+z != 180)//checks if angles add up to 180
               System.out.println("Triangle is not possible");
           else if (x <= 0 || y <= 0 || z <= 0)//checks for zero and nonzero values
               System.out.println("Triangle is not possible");
           else if ( x == y && y == z && x == z)
               System.out.println("Equilateral");
           else if ( x == y || y == z || x == z)
               System.out.println("Isosceles");
           else if (x == 90 || y == 90 || z == 90)
               System.out.println("Right Triangle");
           else
               System.out.println("No special qualities");
            }
       else
           System.out.println("Enter 'sides' or angles'");
       
       
       
       
       
       
    }
}
