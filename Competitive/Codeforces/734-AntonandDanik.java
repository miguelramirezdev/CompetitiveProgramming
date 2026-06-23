import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(in.readLine());
        String s = in.readLine();
        int D = 0, A = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'D'){
                D++;
            }else {
                A++;
            }
        }
        if (A > D) {
            System.out.println("Anton");
        } else if (D > A) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

    }
}
