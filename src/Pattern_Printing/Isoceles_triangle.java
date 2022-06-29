package Pattern_Printing;
import java.util.Scanner;

public class Isoceles_triangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        String str1 = "";
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-i-1 ; j++) System.out.print(" ");
            str+=(i+1);
            System.out.print(str);
            if(i==0) System.out.println();
            else{
                str1 = i + str1;
                System.out.println(str1);
            }
        }
    }
}
