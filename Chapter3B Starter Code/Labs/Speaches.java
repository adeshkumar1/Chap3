package Labs;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
public class Speaches
{
     public static void main (String [] args) throws IOException
     {
        
         Scanner scan = new Scanner(new File ("Labs/taft.txt"));
         //Scanner scan = new Scanner(new File ("Labs/gwbush.txt"));
         //Scanner scan = new Scanner(new File ("Labs/jimmycarteracrisisofconfidence.txt"));
         //Scanner scan = new Scanner(new File ("Labs/obama_inaugural_speach.txt"));
         //Scanner scan = new Scanner(new File ("Labs/RutherfordBHayesInaugural.txt"));
         //Scanner scan = new Scanner(new File ("Labs/AbrahamLincolnAHouseDivided.txt"));
         String s = scan.nextLine();
         String b = scan.nextLine();
         DecimalFormat two = new DecimalFormat("0.00");//decimal formats for two decimals
         String word = "";
         double sum = 0;
         double i = 0;
         double people = 0, government = 0, united = 0, our = 0;
         while(scan.hasNext())
         {
            word = scan.next();//collects every word
            sum += word.length();//finds the total sum of words
            i++;
            word = word.toLowerCase();//makes it lowercase
            if (word.equals("people"))
                people++;
            if (word.equals("government"))
                government++;
            if (word.equals("united"))
                united++;
            if (word.equals("our"))
                our++;
            
         }
         sum = sum/i;//average word length
         System.out.println(s+"\n"+b+"\n");//prints first two lines
         System.out.println("There are "+i+" words");//total amount of words
         System.out.println("The average word length is " + two.format(sum));//average word length
         
         System.out.println("People was said " + two.format(people)+" times "+(two.format(100*people/i))+"%");
         System.out.println("Government was said " + two.format(government) +" times "+(two.format(100*government/i))+"%");
         System.out.println("United was said " + two.format(united) +" times "+(two.format(100*united/i)+"%"));
         System.out.println("Our was said " + two.format(our) +" times "+(two.format(100*our/i))+"%");
        }
}
