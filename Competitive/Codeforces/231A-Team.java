/**
 *  author:  migrmez
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        int c = 0 , p = 0;
        while (n-->0){
            for (int i = 0; i < 3; i++) {
                int x = in.nextInt();
                if(x == 1){
                    p++;
                }
            }
            if(p >= 2){
                c++;
            }
            p = 0;
        }
        System.out.println(c);
    }
}