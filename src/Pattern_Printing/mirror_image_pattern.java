package Pattern_Printing;
import java.util.Scanner;

public class mirror_image_pattern {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       String str = "";
       for(int i=0 ; i<n ; i++){
           for(int j=0 ; j<n-i-1 ; j++) System.out.print(" ");
           str+='*';
           System.out.println(str);

       }
   }
}
