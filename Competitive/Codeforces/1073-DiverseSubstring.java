

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        String s = in.readLine();
        String ans = null;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                ans = "" + s.charAt(i) + s.charAt(i + 1);
                //System.out.println(ans);
            }
        }
        if (ans != null) {
            System.out.println("YES");
            System.out.println(ans);
        } else {
            System.out.println("NO");
        }
    }
}
