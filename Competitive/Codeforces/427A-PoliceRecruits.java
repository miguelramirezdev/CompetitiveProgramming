/**
 *  author:  migrmez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int police = 0, crimes = 0;
        for (int i = 0; i < n; i++) {
            int event = in.nextInt();
            if(event > 0){
                police += event;
            }else{
                police--;
            }if(police < 0){
                police = 0;
                crimes++;
            }
        }
        System.out.println(crimes);
    }
}

