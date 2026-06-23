/**
 *  author:  migrmez
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String code = in.next();
        code = code + "x";
        int i = 0 ;
        for (i = 0; i < code.length() -1; i++) {
            if(code.charAt(i) == '.'){
                System.out.print("0");
            }else if(code.charAt(i) == '-' && code.charAt(i+1) == '.'){
                System.out.print("1");
                i++;
            }else if(code.charAt(i) == '-' && code.charAt(i+1) == '-'){
                System.out.print("2");
                i++;
            }
        }
        System.out.println();
    }
}

