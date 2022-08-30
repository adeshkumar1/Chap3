
/**
 * Write a description of class A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A
{
    public static void main (String []args)
    {
        int x = -1;
        for(int a = 1; a < 20;a++)  
        {
            if (x<0)
                x=a; 
                System.out.println(a+ " " + x);
        
        }
        System.out.println(x);
    }
}
