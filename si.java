package OOPS;
import java.util.*;
public class si {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        int p = sc.nextInt();
        System.out.println("Enter rate of interst:");
        int r = sc.nextInt();
        System.out.println("Enter time:");
        int t = sc.nextInt();
        double si = (p * r * t) / 100.0;
        System.out.println("Simple Interest:" + si);
    }
}
