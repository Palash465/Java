package OOPS;

import java.util.*;

public class nat1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int i = 1;
        while (i != n + 1) {
            System.out.println(i);
            i++;
        }
    }
}