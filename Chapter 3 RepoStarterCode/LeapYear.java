/*
 * Adesh Kumar
 * 9/28/21
 * LeapYear
 * Calculates whether the inputted year is a leap year or not
 */


import java.util.*;
public class LeapYear
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int x;
        
        System.out.println("Enter the Year: ");
        x = scan.nextInt();
        
        if (x < 1582)
            System.out.println("Enter a year greater than 1582");
        else if (x % 4 != 0)
            System.out.println(x + " " + "is not a leap year");
        else if (x % 100 == 0 && x % 400 == 0)
            System.out.println(x + " " + "Is a leap year");
        else if (x % 100 == 0 && x % 400 != 0)
            System.out.println(x + " " + "Is not a leap year");
        else
            System.out.println(x + " " + "Is a leap year");
       
            
        
        
        
        
        
        
        
        
        
    }
}
