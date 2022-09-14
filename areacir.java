/*program to find the area of the circle */
import java.util.*;
public class areacir {
    public static void main (String[] args){
        double radius;
        double Area;
        float pi=3.14F;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the radius of circle :");
        radius= sc.nextDouble();
        Area=pi*radius*radius;
        System.out.println(" The area of the circle is :"+Area);

    
}
    
}

