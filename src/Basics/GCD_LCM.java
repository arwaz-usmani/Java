package Basics;
import java.util.Scanner;

public class GCD_LCM {
    public static int GCD(int a , int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;
        if(a>b) return GCD(a-b,b);
        else return GCD(a,b-a);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int gcd = GCD(a,b);
        System.out.println("GCD = "+ gcd);

        int lcm = (a*b)/gcd;
        System.out.println("LCM = "+lcm);

    }
}
