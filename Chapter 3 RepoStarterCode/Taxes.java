/*
 * Adesh
 * 9/28/21
 * Taxes
 * Calculates how much tax should be paid based off of the salary
 */
import java.util.*;
import java.text.DecimalFormat;
public class Taxes
{
   public static void main (String [] args)
    {
        double money,tax;
        Scanner scan = new Scanner(System.in);
        DecimalFormat twodec = new DecimalFormat("0.00");//formats for 2 decimals
        
        System.out.println("Enter Your Salary: ");
        money = scan.nextDouble();
        
        if (money <= 50000)
            tax = money*0.01;
        else if (money <=75000)
            tax = (50000)*0.01+(money-50000)*.02;//50000 taxed at 1% rest taxed at 2%
        else if (money <=100000)
            tax = 50000*0.01+25000*0.02+(money-75000)*0.03;//50000 taxed 1% 25000 taxed 2% rest taxed at 3%
        else if (money <=250000)
            tax = 50000*0.01+25000*0.02+25000*0.03+(money-100000)*0.04;//50000 taxed 1% 25000 taxed 2% 25000 taxed 3% rest taxed at 4%
        else if (money <=500000)
            tax = 50000*0.01+25000*0.02+25000*0.03+150000*0.04+(money-250000)*0.05;//50000 taxed 1% 25000 taxed 2% 25000 3% 150000 taxed 4% rest taxed 5%
        else
            tax = 50000*0.01+25000*0.02+25000*0.03+150000*0.04+250000*0.05+(money-500000)*0.06;//50000 taxed 1% 25000 taxed 2% 25000 3% 150000 taxed 4% 250000 taxed 5% rest taxed 6%
        System.out.println("You have to pay: " + "$" + twodec.format(tax));
    }

}
