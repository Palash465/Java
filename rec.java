package OOPS;
import java.util.*;
public class rec
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l= sc.nextInt();
        System.out.println("Enter breadth:");
        int b= sc.nextInt();
        double ar = (2*l*b);
        System.out.println("Area of rectangle:" + ar);
    }
}
