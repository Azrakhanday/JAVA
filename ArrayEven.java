/* program to find number of even and odd elements in an array */
import java.util.*;
public class ArrayEven {
    public static void main (String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the elements of an array you want to enter:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all the elements of an array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println(" Odd numbers:");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]+ " ");
            }
        }
        System.out.println(" ");
        System.out.println("Even numbers :");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
            System.out.println(arr[i]+ " ");
            }
        }
    }
    
    
}
