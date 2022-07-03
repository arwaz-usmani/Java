package Basics;
import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f0 = 0;
        int f1 = 1;
        System.out.print(f0+" "+f1+" ");
        for(int i=2 ; i<n ; i++){
            int f2 = f0 + f1;
            System.out.print(f2+" ");
            f0 = f1;
            f1 = f2;
        }
    }
}
