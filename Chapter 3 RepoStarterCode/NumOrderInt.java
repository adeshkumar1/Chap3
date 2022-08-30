import java.util.Scanner;

public class NumOrderInt
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      int x, y, z;
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
     
     
     
        if (x<=y)
            if (y<=z)
        System.out.println("In order");
        else
        System.out.println("Not in order");
       
        else
            if (y>=z)
        System.out.println("In order");
            else
        System.out.println("Not in order");
     
     
     

   }
}