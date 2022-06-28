package Pattern_Printing;
import java.util.Scanner;

public class Character_pattern_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char c = 'A';
        String str = "";
        for(int i=0 ; i<n ;i++){
            str+=c;
            c++;
        }
        for(int i=0 ; i<n ; i++) System.out.println(str);
    }
}
