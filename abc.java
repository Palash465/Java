package OOPS;

class ab {
    static int a = 10;

    static void otp() {
        System.out.println(a);
    }

    void otp2() {
        System.out.println(a);
    }
}

public class abc {
    public static void main(String args[]) {
        ab ob = new ab();
        ob.otp2();
        ab.otp();
    }
}
