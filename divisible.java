package OOPS;
import java.util.*;
public class divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int i=sc.nextInt();
        if(i%3==0 && i%5==0)
            System.out.println("Divisible by 3 and 5");
        else
            System.out.println("Not divisible");
    }
}
