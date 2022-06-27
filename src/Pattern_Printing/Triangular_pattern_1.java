package Pattern_Printing;
import java.util.Scanner;

public class Triangular_pattern_1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        for(int i=1 ; i<=n ; i++){
            str+=i;
            System.out.println(str);
        }
    }
}
