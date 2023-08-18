package OOPS;

import java.util.*;

public class strong {
    static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        sc.close();
        return a;
    }

    int fact(int t) {
        int s = 1;
        for (int x = 1; x <= t; x++) {
            s = s * x;
        }
        return s;
    }

    void strong1() {
        int i = input();
        int t = i;
        int sum = 0;
        strong ob = new strong();
        while (t != 0) {
            int d = t % 10;
            int z = ob.fact(d);
            sum = sum + (z);
            t = t / 10;
        }
        if (sum == i)
            System.out.println("Strong number");
        else
            System.out.println("Not strong number");
    }

    public static void main(String args[]) {
        strong ob = new strong();
        ob.strong1();
    }
}
