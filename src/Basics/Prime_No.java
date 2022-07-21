package Basics;
import java.util.Scanner;
import java.lang.Math;

public class Prime_No {
    public static boolean optimized(int n){
        if(n==2) return true;
        if(n%2==0) return false;
        double N = Math.sqrt(n);
        for(int i=3 ; i<=N ; i+=2){
            if(n%i==0) return false;
        }
        return true;
    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        //normal
        for(int i=2 ; i<n ; i++){
            if(n%i == 0){
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime No.");

        // optimized method
        boolean ans = optimized(n);
        if(ans==true) System.out.println("Prime no.");
        else  System.out.println("Not a prime");

        System.out.println(Math.sqrt(n));

    }
}
