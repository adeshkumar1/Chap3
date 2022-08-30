package Labs;
import java.util.*;
public class Palindrome
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.toLowerCase();
        String reverse = "";
        for (int c = 0;c<str.length()-1;c++)
        {
            if (str.charAt(c) == ' ')//checks for spaces
                str = str.substring(0,c)+str.substring(c+1,str.length());//gets rid of spaces
        
        
        
        }
        for (int c = str.length()-1;c>=0;c--)//reverses string
        {
            reverse += str.substring(c,c+1);
        
        }
        
        if (reverse.equals(str))//checks if the reverse is equal to the actual
            System.out.println("palindrome");
        else 
            System.out.println("not palindrome");
    }
}
