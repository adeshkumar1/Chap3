import java.util.*;
public class Sentence
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String sen = " ";
        int i;
        
        System.out.println("Enter The Sentence: ");
        sen = scan.nextLine();
        
        for (i = sen.length()-1;i >= 0;i--)
        {
            System.out.println(sen.charAt(i));
        }
        for (i = sen.length()-1;i >= 0;i--)
        {
            if (sen.charAt(i) >= 65 && sen.charAt(i) <= 90) 
                System.out.println("Capital: " + sen.charAt(i));
        }
        
        int num = 0;
        for (i = 0; i <= sen.length()-1; i++)
        {
            if (sen.charAt(i) == 65 || sen.charAt(i) == 69 || sen.charAt(i) == 73 || sen.charAt(i) == 79 || sen.charAt(i) == 85 || sen.charAt(i) == 97 || sen.charAt(i) == 101 || sen.charAt(i) == 105 || sen.charAt(i) == 111 || sen.charAt(i) == 117)
        {    
            System.out.print('_');
            num +=1;
        }
            else
                System.out.print(sen.charAt(i));
        }
        System.out.println("\nYour Sentance Has " + num + " Vowels");
    
    
    
    
    
    
    
    
    
    
    }
}
