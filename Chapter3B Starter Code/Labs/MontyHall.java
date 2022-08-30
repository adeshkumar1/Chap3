package Labs;
import java.util.*;


public class MontyHall
{
    public static void main (String [] args)
    {
       int player = 0,winner = 0;
       int Stick=0,Switch=0;
       Random gen = new Random();
       for (int i = 1; i <= 1000; i++)
        {
            player = gen.nextInt(3)+1;//generates number 1-3
            winner = gen.nextInt(3)+1;//generates number 1-3
            if (player == winner)//player would have won if stick
                Stick +=1;
            else if (player != winner)//player would have won if switch
                Switch += 1;
        }
       System.out.println("If you switched every time you would have won "+ Switch+" times");
       System.out.println("If you stuck every time you would have won "+ Stick+" times"); 
        
        
    }
}
