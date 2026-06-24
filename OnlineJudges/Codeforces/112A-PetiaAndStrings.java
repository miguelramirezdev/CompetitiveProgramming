/**
 *  author:  migrmez
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next().toLowerCase();
        String b = in.next().toLowerCase();
        if(a.compareTo(b) == 0){
            System.out.println("0");
        } else if(a.compareTo(b) < 0 ){
            System.out.println("-1");
        } else{
            System.out.println("1");
        }
    }
}