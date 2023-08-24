package OOPS;
import java.util.*;
public class first
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int x=sc.nextInt();
        String str=""+x;
        int len=str.length();
        int f=(int)(x/(Math.pow(10,len-1)));
        int l=x%10;
        System.out.println("First digit:"+f);
        System.out.println("Last digit:"+l);
    }    
}
