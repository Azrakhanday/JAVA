import java.util.*; 
public class OverweighthtException extends Exception
{



OverweighthtException(String msg)
{
    System.out.println("over weight");

}
}
  class demo{
 
 public static void Elevator() throws OverweighthtException
 {
     int weight=0;
     System.out.println("enter weight in kilograms:");
     Scanner sc=new Scanner(System.in);
     weight=sc.nextInt();
     if(weight>1500)
     { 
         throw new OverweighthtException("over weight");
         
     }
     else 
       {
         System.out.println("under weight");
       }
 }
}
 public class Overweight{
    public static void main( String [] args )
    {
        
        demo w = new demo();
  
        try{
             demo.Elevator();
             }
         catch(Exception e)
       {
          System.out.println(e.toString());
       }
         finally
           { 
            System.out.println("will still execute");
           }
    }

}

