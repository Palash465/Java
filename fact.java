package OOPS;
import java.util.*;
public class fact
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int f=1;
        for(int x=n;x>=1;x--)
        {
            f=f*x;
        }
        System.out.println(f);
    }
}
