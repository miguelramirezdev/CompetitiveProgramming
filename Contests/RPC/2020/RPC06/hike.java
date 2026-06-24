import java.util.Scanner;

public class hike {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] vec = new int[n];
        for (int i = 0; i < n; i++) {
            vec[i] = in.nextInt();
        }
        int[] vec1 = {0, 100};
        for (int i = 0; i + 2 < n; i++) {
            int aux = Math.max(vec[i], vec[i + 2]);
            if (aux < vec1[1]) {
                vec1[0] = i + 1;
                vec1[1] = aux;
            }
        }
        System.out.println(vec1[0] + " " + vec1[1]);
    }
}
