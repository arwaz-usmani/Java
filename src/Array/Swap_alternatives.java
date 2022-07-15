package Array;
import java.util.Scanner;

public class Swap_alternatives {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i] = s.nextInt();
        }

        for(int i=0 ; i+1<a.length ; i+=2){
            int d = a[i+1];
            a[i+1] = a[i];
            a[i] = d;
        }

        for(int i=0 ; i<a.length ; i++) System.out.print(a[i] + " ");
    }
}
