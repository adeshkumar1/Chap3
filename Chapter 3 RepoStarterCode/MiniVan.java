/*
 * Adesh Kumar
 * 9/28/21
 * MiniVan
 * Takes MiniVan input and decides which doors open
 */


import java.util.*;
public class MiniVan
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int DL,DR,CL,MU,IL,IR,OL,OR;
        String Gear;
        int Right=0,Left=0,Neither=0;
        
        System.out.println("Enter the MiniVan Status: ");
        DL = scan.nextInt();
        DR = scan.nextInt();
        CL = scan.nextInt();
        MU = scan.nextInt();
        IL = scan.nextInt();
        IR = scan.nextInt();
        OL = scan.nextInt();
        OR = scan.nextInt();
        Gear = scan.next();
        
        if (MU == 0)//Adds 1 to neither if master is off
            Neither +=1;
        if (!(Gear.equals("P")))//adds 1 to neither if it is not in P
            Neither +=1;
        if (CL == 0 && IL == 1)//adds 1 to left is child lock off and inside left on
            Left +=1;
        if (CL == 0 && IR == 1)//adds 1 to right is child lock off and inside right on
            Right +=1;
        if (DL == 1)//adds to left if dashboard left on
            Left +=1;
        if (DR == 1)//adds to right if dashboard left on
            Right +=1;
        if (OL == 1)//adds one to left if outside left is on
            Left +=1;
        if (OR == 1)//adds one to right if outside right is on
            Right +=1;
        
        
        if (Neither>0 ||(Left == 0 && Right == 0))
            System.out.println("Neither");
        else if (Left>0 && Right>0)
            System.out.println("Both");
        else if (Left>0)
            System.out.println("Left Door Opens and Right Door is Closed");
        else if (Right>0)
            System.out.println("Right Door Opens and Left Door is Closed");
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
