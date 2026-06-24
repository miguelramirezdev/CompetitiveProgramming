import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String x = in.readLine().toLowerCase();
        String y = in.readLine().toLowerCase();
        if(x.compareTo(y) < 0){
            System.out.println("-1");
        }else if(x.compareTo(y) > 0){
            System.out.println("1");
        }else {
            System.out.println(x.compareTo(y));
        }
    }
}