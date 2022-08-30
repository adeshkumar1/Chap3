package e20;

import java.util.Scanner;
/**
 * Read three floating-point numbers and print
 * the largest of the three.
 */
public class MaxOfThree
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter three numbers: ");
      double number1,number2,number3;
      double largest = 0.0;
      
      
      
      
      number1 = in.nextDouble();
      number2 = in.nextDouble();
      number3 = in.nextDouble();
      
      if (number1 >= number2 && number1 >= number3)
      {
        largest = number1;
        System.out.println("The largest number is " + largest);
      }
      else if (number2 >= number1 && number2 >= number3)
      {
        largest = number2;
        System.out.println("The largest number is " + largest);
      }
      else if (number3 >= number1 && number3 >= number2)
      {  
        largest = number3;
        System.out.println("The largest number is " + largest);
      }  
      else 
        System.out.println("There is no largest number");
       
      
      
      
      
      
      
      
         
      
   }
}
