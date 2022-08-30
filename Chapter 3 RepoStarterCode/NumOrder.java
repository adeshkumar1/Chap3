import java.util.Scanner;

public class NumOrder
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
      System.out.print("Enter three numbers: ");
      int x, y, z;
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
     
     
      if ((x != y) && (x != z) && (y!= z))
        if (x<y)
            if (y<z)
        System.out.println("Increasing");
        else
        System.out.println("Neither");
       
        else
            if (y>z)
        System.out.println("Decreasing");
            else
        System.out.println("Neither");
      else
      System.out.println("Neither");
     
     
     
     


   }
}
