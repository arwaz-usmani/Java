package Pattern_Printing;
import java.util.Scanner;

public class Triangle_of_numbers {
    public static void main(String[] agrs){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=0 ; j<2*(n-i) ; j++) System.out.print(" ");
            int x=i;
            for(int j=1 ; j<=(2*i) - 1 ; j++){
                if(j<=((2*i)-1)/2){
                    System.out.print(x);
                    x++;
                }
                else{
                    System.out.print(x);
                    x--;
                }
            }
            System.out.println(" ");
        }
    }
}
