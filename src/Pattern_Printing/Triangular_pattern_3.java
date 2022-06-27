package Pattern_Printing;
import java.util.Scanner;

public class Triangular_pattern_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1 ; i<=n ; i++){
            String str = "";
            int x = i;
            for(int j=0 ; j<i ; j++){
                str+=x;
                x++;
            }
            System.out.println(str);
        }
    }
}
