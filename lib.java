package OOPS;

import java.util.*;

public class lib {
    void area_of_cir(double r) {
        double ar = (22 / 7.0) * r * r;
        System.out.println(ar);
    }

    void area_of_rec(int a, int b) {
        int ar = 2 * a * b;
        System.out.println(ar);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double r = sc.nextDouble();
        System.out.println("Enter length of rectangle:");
        int a = sc.nextInt();
        System.out.println("Enter breadth of rectangle:");
        int b = sc.nextInt();
        lib ob = new lib();
        ob.area_of_cir(r);
        ob.area_of_rec(a, b);
        sc.close();
    }
}
