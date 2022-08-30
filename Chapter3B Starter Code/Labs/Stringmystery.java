


package Labs;
import java.util.*;
import java.lang.*;
import java.io.*;
/*
 * Adesh Kumar
 * 11/4/21
 * String Mystery
 * Checks if each digit is the same as next and if it is the same as the one halfway in front
 */
public class Stringmystery
{
     public static void main (String [] args) throws IOException
     {
        
         Scanner scan = new Scanner(new File ("Labs/StringMysteryInput.txt"));
         String s = scan.nextLine();
         
         int sum = 0;
         int sum1 = 0;
         for (int i = 0; i <= s.length()-1;i++)//checks if each digit is same as next digit
         {
             
             if (i == s.length()-1)
                {if (s.charAt(i)==s.charAt(0))
                    sum += Integer.parseInt(s.substring(i));}
             else if (s.charAt(i) == s.charAt(i+1))
               sum += Integer.parseInt(s.substring(i,i+1));
               
         }
         System.out.println("1: " + sum);
         int length2 = s.length()/2;
       
         for (int i = 0;i <= length2-1;i++)//checks if the digit is the same as the one halfway in front
         {
           if (s.charAt(i) == s.charAt(i+length2))//makes sure will be circular 
           sum1 += 2*Integer.parseInt(s.substring(i,i+1));
        }
        System.out.println("2: "+ sum1);
        }
     
}
