/*
 * Adesh Kumar
 * 9/28/21
 * Planet
 * Calculates user's weight on each planet
 */



import java.util.*;
import java.text.DecimalFormat;
public class Planet
{
    public static void main (String [] args)
    {
        double weight;
        Scanner scan = new Scanner (System.in);
        String planet;
        
        DecimalFormat twodec = new DecimalFormat("0.##");
        System.out.println("Select a planet \n" + "Mercury \n"+"Venus \n" + 
            "Earth \n" + "Mars\n" + "Jupiter \n" + "Saturn \n" + "Uranus \n" + 
            "Neptune \n");
        planet = scan.nextLine();
        
        System.out.println("Enter your weight: ");
        weight = scan.nextDouble();
        
        switch (planet)
        {
           case "Mercury":
           System.out.println(twodec.format(weight*0.38)+" pounds");
           break;
           case "Venus":
           System.out.println(twodec.format(weight*.91)+" pounds");
           break;
           
           case "Earth":
           System.out.println(twodec.format(weight*1)+" pounds");
           break;
           
           case "Mars":
           System.out.println(twodec.format(weight*.38)+" pounds");
           break;
           
           case "Jupiter":
           System.out.println(twodec.format(weight*2.34)+" pounds");
           break;
           
           case "Saturn":
           System.out.println(twodec.format(weight*1.06)+" pounds");
           break;
           
           case "Uranus":
           System.out.println(twodec.format(weight*.92)+" pounds");
           break;
           
           case "Neptune":
           System.out.println(twodec.format(weight*1.19)+" pounds");
           break;
           
           default:
           System.out.println("Enter one of the planet's name");
           
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }
}
