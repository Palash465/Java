package OOPS;
import java.util.*;
public class nat2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int i=1;
        do
        {
            System.out.println(i);
            i++;
        }while(i!=n+1);
    }
}
