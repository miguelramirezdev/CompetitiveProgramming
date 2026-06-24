

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());
        while (t-- > 0) {
            String line = in.readLine();
            Stack<Character> p = new Stack<>();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'B' && !p.empty()) {
                    p.pop();
                } else {
                    p.push(line.charAt(i));
                }
            }
            System.out.println(p.size());
        }
    }
}
