
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());
        while (t-->0) {
            int n = Integer.valueOf(in.readLine());
            String line = in.readLine().toLowerCase();
            int x = 0, m = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '(') {
                    x++;
                } else {
                    x--;
                }
                m = Math.min(m, x);
                //System.out.println(m);
            }
            System.out.println(-1 * m);
        }
    }
}
