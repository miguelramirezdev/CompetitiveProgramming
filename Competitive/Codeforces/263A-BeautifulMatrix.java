/**
 *  author:  migrmez
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matrix [][] = new int[5][5];
        int r = 0 , c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = in.nextInt();
                if(matrix[i][j] == 1){
                    r = i + 1;
                    c = j + 1;
                    break;
                }
            }
        }
        int moves = Math.abs(3 - r)+ Math.abs( 3 - c );
        System.out.println(moves);
    }
}