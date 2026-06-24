/**
 *  author:  migrmez
 */
import java.util.Scanner;
 
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int groups = 0;
        if(n == 1){
            System.out.println("1");
        }else{
            String x = in.next();
            for (int i = 0; i < n-1; i++) {
               String y = in.next();
               if(x.charAt(1) == y.charAt(0)){
                   groups++;
               }
               x = y ;
            }
            System.out.println(groups + 1);
        }
    }
}