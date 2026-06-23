/**
 *  author:  migrmez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next() ;
        int stomes = 0;
        char first = s.charAt(0);
        for (int i = 1; i < n ; i++) {
            if(first == s.charAt(i)){
                stomes++;
            }
            first = s.charAt(i);
        }
        System.out.println(stomes);
    }
}

