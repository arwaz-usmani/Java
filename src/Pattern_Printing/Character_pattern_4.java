package Pattern_Printing;
import java.util.Scanner;

public class Character_pattern_4 {
    public static void main(String[] agrs){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char c = (char)('A' + n -1);
        String str = "";
        for(int i=0 ; i<n ; i++){
            str = (c + str);
            System.out.println(str);
            c--;
        }
    }


}
