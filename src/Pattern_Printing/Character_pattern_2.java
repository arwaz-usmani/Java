package Pattern_Printing;
import java.util.Scanner;

public class Character_pattern_2 {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int n  = s.nextInt();
       char c = 'A';
       for(int i=0 ; i<n ; i++){
           String str = "";
           for(int j=0 ; j<=i ; j++){
               str+=c;
           }
           c++;
           System.out.println(str);
       }
   }
}
