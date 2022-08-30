package Labs;
import java.util.*;
/*
 * Adesh Kumar
 * 11/4/21
 * Fibonocci
 * prints the digits of fibonocci
 */
public class Fibonacci
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many digits of the Fibonacci sequence do you want?");
        int a = scan.nextInt();
        System.out.print(" " + 0 + " " + 1 +" ");
        int prev = 0;
        int next = 0;
        int current = 1;
        for (int i = 0; i < a-2;i++)//finds each digit of the fibonicci sequence
        {
            next = prev+current;
            System.out.print(next+" ");
            prev = current;
            current = next;
        }
    }
}
