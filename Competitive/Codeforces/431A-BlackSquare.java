/**
 *  author:  migrmez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] calories = new int [4];
        for (int i = 0; i < 4; i++) {
            calories[i] = in.nextInt();
        }
        String s = in.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int strip = Character.getNumericValue(s.charAt(i));
            if(strip == 1){
                ans += calories[0];
            }else if(strip == 2){
                ans += calories[1];
            }else if(strip == 3){
                ans += calories[2];
            }else{
                ans += calories[3];
            }
        }
        System.out.println(ans);
    }
}

