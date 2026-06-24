import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        int l = 0, u = 0;
        for (int i = 0; i < line.length() ; i++) {
            if(Character.isLowerCase(line.charAt(i))){
                l++;
            }else{
                u++;
            }
        }
        if(l > u || l == u ){
            System.out.println(line.toLowerCase());
        }else{
            System.out.println(line.toUpperCase());
        }
    }
}
