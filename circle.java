package OOPS;
import java.util.*;
public class circle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        int r = sc.nextInt();
        double ar = (22 / 7.0) * r * r;
        System.out.println("Area of circle:" + ar);
    }
}
