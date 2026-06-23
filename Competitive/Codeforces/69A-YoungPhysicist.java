/**
 *  author:  migrmez
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int coordinates[] = new int[]{0,0,0};
        while (n -->0){
            coordinates[0] += in.nextInt();
            coordinates[1] += in.nextInt();
            coordinates[2] += in.nextInt();
        }
        System.out.println(coordinates[0] == 0 && coordinates[1] == 0
                && coordinates[2] == 0? "YES" : "NO");
    }
}

