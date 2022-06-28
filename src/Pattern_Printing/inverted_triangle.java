package Pattern_Printing;
import java.util.Scanner;

public class inverted_triangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=n ; i>0 ; i--){
            String str = "";
            for(int j=i ; j>0 ; j--) str+='*';
            System.out.println(str);
        }
    }
}
