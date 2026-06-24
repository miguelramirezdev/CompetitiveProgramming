import java.util.*;

public class animals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        char aux1 = line.charAt(line.length() - 1);
        int n = in.nextInt();

        String[] vec1 = new String[n];
        for (int i = 0; i < n; i++) {
            vec1[i] = in.next();
        }
        int[] vec2 = new int[128];
        for (int i = 0; i < n; i++) {
            vec2[vec1[i].charAt(0)]++;
        }

        for (int i = 0; i < n; i++) {
            char x = vec1[i].charAt(0), y = vec1[i].charAt(vec1[i].length() - 1);
            if (x == aux1 && (vec2[y] == 0 || (x == y && vec2[y] == 1))) {
                System.out.println(vec1[i] + "!");
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            if (vec1[i].charAt(0) == aux1) {
                System.out.println(vec1[i]);
                return;
            }
        }
        System.out.println("?");
    }
}
