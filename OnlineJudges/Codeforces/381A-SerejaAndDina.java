/**
 *  author:  migrmez
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sereja = 0, dina = 0;
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = in.nextInt();
        }

        int i = 0 ;
        int j = n - 1;
        int turn = 0;

        while (i <= j){
            if (cards[i] > cards[j]){
                if (turn % 2 == 0){
                    sereja += cards[i];
                }else {
                    dina += cards[i];
                }
                i++;
            }else{
                if (turn % 2 ==0){
                    sereja += cards[j];
                }else {
                    dina += cards[j];
                }
                j--;
            }
            turn++;
        }
        System.out.println(sereja + " "+ dina);

    }
}

