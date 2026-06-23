

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        String s = in.readLine().toLowerCase();
        boolean a[] = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            a[(int) s.charAt(i) - 97] = true;
        }
        boolean band = true;
        for (int i = 0; i < a.length; i++) {
            if (!a[i]) {
                System.out.println("NO");
                band = false;
                break;
            }
        }
        if (band) {
            System.out.println("YES");
        }

    }
}
