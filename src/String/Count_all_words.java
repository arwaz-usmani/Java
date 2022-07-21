package String;
import java.util.Scanner;

public class Count_all_words {
    public static int count_words(String str){
        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count+1;
    }


    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       System.out.println(count_words(str));
    }
}
