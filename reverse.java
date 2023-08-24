package OOPS;
import java.util.*;
public class reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int n2=0;
        while(n!=0)
        {
            int d=n%10;
            n2=(n2*10)+d;
            n=n/10;
        }
        System.out.println(n2);
    }
}
