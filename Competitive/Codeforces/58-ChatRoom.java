

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine().toLowerCase();
        String aux = "hello";
        int x = 0, y = 0;
        boolean band = false;
        for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == aux.charAt(x)){
                    y++;
                    x++;
                }
                if(y == 5){
                    band = true;
                    break;
                }
        }
        if(band){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
