package e21;

import java.util.Scanner;

/**
   This program sorts three strings.
*/
public class StringSorterDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String small = "", middle = "",large = "";

      System.out.print("Please enter three strings:");
      String str1 = in.next();
      String str2 = in.next();
      String str3 = in.next();

      if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0)
      {
        large = str1;
    
        if (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0)
        {
        middle = str2;
        small = str3;
        }
        else
        middle = str3;
        small = str2;
    }
      else if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0)
     {
        large = str2;
    
        if (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0)
        {
        middle = str1;
        small = str3;
        }
        else
        middle = str3;
        small = str1;
    }
      else if (str3.compareTo(str1) > 0 && str3.compareTo(str2) > 0)
        {
        large = str3;
    
        if (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0)
        {
        middle = str1;
        small = str2;
        }
        else
        middle = str2;
        small = str1;
    }
      
        

      System.out.println("Smalest is"+ small + "\n"
      + "In the Middle is" + middle+ "\n"
      + "The Largest is" + large);



   }
}
