import java.util.*;
public class Switch
{
        public static void main (String[] args)
   {
            Scanner Keyboard = new Scanner(System.in);
            char choice;

       // switch statement------------------------------


            System.out.print("What would you like to buy?\n");
            System.out.print("f) fries\n");
            System.out.print("c) cheese\n");
            System.out.print("s) small drink\n");

            choice = Keyboard.next().charAt(0);
            //choice can be: char, int, or string
            //like else if, will find true
            //switch will cascade through
            switch (choice)
            {
                case 'F':
                case 'f':
                    System.out.println(".99");
                    break;
                case 'c':
                    System.out.println("1.50");
                    break;
                case 's':
                    System.out.println("0.79");
                    break;
                
                default: //replacement for else
                    System.out.println("enter f,c,or s");
            }
            

    }//endo of main
}//end of class