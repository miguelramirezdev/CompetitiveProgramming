/**
 *  author:  migrmez
 */
import java.util.Scanner;
 
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int upperCase = 0 , lowerCase = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                upperCase++;
            }else{
                lowerCase++;
            }
        }
        System.out.println(upperCase > lowerCase? s.toUpperCase() : s.toLowerCase());
    }
}