import java.util.Scanner;

public class TwoPair
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter four numbers: ");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int d = in.nextInt();
      
      if (a == b)
      
          if (c == d)
          
            System.out.print("Two Pairs");
          else
            System.out.print("No 2 Pair");
      else if (a == c)
        if (b ==d)
            System.out.println("Two Pairs");
        else
            System.out.println("No 2 Pair");
      else if (a == d)
        if (b == c)
            System.out.println("Two Pairs");
        else
            System.out.println("No 2 Pair");
      else 
        System.out.println("No 2 Pairs");
      
      
      
      
      
      

   }
}
