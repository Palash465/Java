package OOPS;
import java.util.*;
public class compound
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        int p = sc.nextInt();
        System.out.println("Enter rate of interst:");
        int r = sc.nextInt();
        System.out.println("Enter time:");
        int t = sc.nextInt();
        double ci = p*Math.pow((1+(r/100.0)),t);
        System.out.println("Compound Interest:" + (ci-p));
    }
}
