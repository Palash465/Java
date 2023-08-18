package OOPS;

import java.util.*;

public class call {
    static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        sc.close();
        return a;
    }

    void palindrome() {
        int i = input();
        int t = i;
        int sum = 0;
        while (t != 0) {
            int d = t % 10;
            sum = (sum * 10) + d;
            t = t / 10;
        }
        if (sum == i)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }

    public static void main(String args[]) {
        call ob = new call();
        ob.palindrome();
    }
}
