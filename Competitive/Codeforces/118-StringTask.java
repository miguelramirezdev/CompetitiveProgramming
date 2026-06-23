 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line = in.readLine();
        line = line.toLowerCase();
        line = line.replaceAll("a","").replaceAll("e","")
                .replaceAll("i","").replaceAll("o","").replaceAll("u","").replaceAll("y","");
        System.out.print(".");
        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
            if(i<line.length()-1){
                System.out.print(".");
            }
        }
        System.out.println();
 
    }
}