/**
 *  author:  migrmez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "a" + in.next();
        int ans = 0 ;
        for (int i = 0; i < s.length()-1; i++) {
            int x = s.charAt(i) - 96;
            int y = s.charAt(i + 1) -96;
            int distance = Math.min(Math.abs(x - y), Math.abs(26 - (Math.abs (x - y))));
            ans += distance;
        }
        System.out.println(ans);
    }
}
