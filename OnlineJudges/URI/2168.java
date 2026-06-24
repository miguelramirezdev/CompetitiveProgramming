import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ma[][] = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				ma[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (ma[i][j] + ma[i][j + 1] + ma[i + 1][j] + ma[i + 1][j + 1] < 2) {
					System.out.print("U");
				} else {
					System.out.print("S");
				}
			}
			System.out.println();
		}
	}
}