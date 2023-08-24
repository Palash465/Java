package OOPS;
import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int t=n;
        int n2=0;
        while(n!=0)
        {
            int d=n%10;
            n2=(n2*10)+d;
            n=n/10;
        }
        if(n2==t)
        {
            System.out.println("Palindrome number.");
        }
        else
        {
            System.out.println("Not a palindrome number.");
        }
    }
}
