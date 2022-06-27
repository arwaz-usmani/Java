package Pattern_Printing;

import java.util.Scanner;

public class Square_pattern_2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        for(int i=n ; i>0 ; i--) str+=i;
        for(int j=0 ; j<n ; j++) System.out.println(str);
    }
}
