import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            char v[] = line.toCharArray();
            boolean u = true;
            boolean a = true;
            for (int i = 0; i < v.length; i++) {
                if (v[i] == '_' && u) {
                    System.out.print("<i>");
                    u = false;
                } else if (v[i] == '_' && !u) {
                    System.out.print("</i>");
                    u = true;
                } else if (v[i] == '*' && a) {
                    System.out.print("<b>");
                    a = false;
                } else if (v[i] == '*' && !a) {
                    System.out.print("</b>");
                    a = true;
                } else {
                    System.out.print(v[i]);
                }
            }
            System.out.println();
        }
    }
}


