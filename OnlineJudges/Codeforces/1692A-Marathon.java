/**
 *  author:  migrmez
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while ( t-->0){
            int timur = in.nextInt();
            int ans = 0 ;
            for (int i = 0; i < 3; i++) {
                int people = in.nextInt();
                if(people >= timur){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

