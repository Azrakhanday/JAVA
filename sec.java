/*Addition of two numbers */
import java.util.Scanner;
public class sec {
    public static void main (String [] args)
    {
        int a;
        int b;
        int c;
        Scanner sc= new Scanner (System.in);

        System.out.println("enter the value of a :");
        a = sc.nextInt();
        System.out.println("Enter the value of b :");
        b = sc.nextInt();
        sc.close();
        c=a+b;
        System.out.println("the sum of two nos is :"+c);



    }
    
}
