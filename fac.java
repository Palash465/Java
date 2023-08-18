package OOPS;

import java.util.*;

public class fac {
    static void fact(int n) {
        int s = 1;
        for (int x = 1; x <= n; x++) {
            s = s * x;
        }
        System.out.println("Factorial:" + s);
    }

    static void greatest(int a, int b, int c) {
        int g = 0;
        if (a >= b && a >= c)
            g = a;
        else if (b >= a && b >= c)
            g = b;
        else
            g = c;
        System.out.println("Greatest:" + g);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        fact(a);
        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        greatest(x, y, z);
        sc.close();
    }
}
