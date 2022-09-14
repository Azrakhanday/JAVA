import java.util.*;
public class DemoFinally {
    
    public static void main (String args [])
    {
        int x;
        
        System.out.println("Enter any no");
        Scanner s=new Scanner (System.in);
        x=s.nextInt();
       int z=s.nextInt();
        try{
            int y=z/x;
        }
        Catch (Arithematic exception e)
        {
            System.out.println(e.tostring);
        }
        Finally {
            System.out.println("finally executed");
        }



    }
}
