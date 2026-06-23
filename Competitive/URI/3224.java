

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line1 = in.readLine();
        String line2 = in.readLine();
        System.out.println(line1.length() >= line2.length() ? "go" : "no");

    }
}
