/**
 *  author:  migrmez
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName = in.next();
        Set <Character> duplicates = new HashSet<Character>();
        for (int i = 0; i < userName.length(); i++) {
            duplicates.add(userName.charAt(i));
        }
        System.out.println(duplicates.size() % 2 == 0? "CHAT WITH HER!":"IGNORE HIM!");
    }
}
