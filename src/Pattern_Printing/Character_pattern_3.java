package Pattern_Printing;
import java.util.Scanner;

public class Character_pattern_3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0 ; i<n ; i++){
            String str = "";
            char c = 'A';
            c+=i;
            for(int j=0 ; j<n ; j++){
                str+=c;
                c++;
            }
            System.out.println(str);
        }
    }
}
