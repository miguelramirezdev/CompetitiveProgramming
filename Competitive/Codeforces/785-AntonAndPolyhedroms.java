

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        int ans = 0;
        while (n-- > 0) {
            String s = in.readLine();
            if (s.equals("Tetrahedron")) {
                ans += 4;
            } else if (s.equals("Cube")) {
                ans += 6;

            } else if (s.equals("Octahedron")) {
                ans += 8;

            } else if (s.equals("Dodecahedron")) {
                ans += 12;

            } else if (s.equals("Icosahedron")) {
                ans += 20;
            }
        }
        System.out.println(ans);

    }
}
