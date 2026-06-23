/**
 *  author:  migrmez
 */
 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int year = 0;
        while(true){
            if(a > b){
                break;
            }else{
                a *= 3;
                b *= 2;
                year++;
            }
        }
        System.out.println(year);
    }
}