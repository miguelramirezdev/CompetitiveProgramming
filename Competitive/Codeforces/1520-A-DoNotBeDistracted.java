
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());
        while (t-- > 0) {
            int n = Integer.valueOf(in.readLine());
            int vec[] = new int[26];
            boolean b[] = new boolean[26];
            String line = in.readLine().toLowerCase();
            b[(int) line.charAt(0) - 97] = true;
            boolean aux = false;
            for (int i = 1; i < n; i++) {
                if (line.charAt(i) != line.charAt(i - 1)) {
                    int p = (int) line.charAt(i) - 97;
                    if (b[p]) {
                        System.out.println("NO");
                        aux = true;
                        break;
                    } else {
                        b[p] = true;
                    }
                } else {
                    continue;
                }
            }
            if (!aux) {
                System.out.println("YES");
            }
        }
    }
}