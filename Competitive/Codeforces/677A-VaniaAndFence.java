import java.util.Scanner;
/**
 *  author:  migrmez
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int minimum = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a >h){
                minimum += 2;
            }else{
                minimum +=1;
            }
        }
        System.out.println(minimum);
    }
}