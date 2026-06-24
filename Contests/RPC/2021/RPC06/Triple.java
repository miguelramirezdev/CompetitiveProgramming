
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Triple {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int l = s.length() / 3;
        int a = 0, b = l;
        String vec[] = new String[3];
        for (int i = 0; i < 3; i++) {
            String aa = s.substring(a, b);
            vec[i] = aa;
            a = b;
            b += l;
        }
        Arrays.sort(vec);
        System.out.println(vec[1]);
    }
}
