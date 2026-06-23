import java.util.*;

public class feeding {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int c = in.nextInt();

		int[] vec = new int[n];

		for (int i = 0; i < n; i++) {
			vec[i] = in.nextInt();
		}
		Arrays.sort(vec);
		int x = 0, i = n - 1, j = 0;
		while (i > j) {
			if (vec[j] > (c - vec[i])) {
				x++;
				i--;
			} else {
				j++;
				i--;
				x++;
			}
		}
		if (i == j)
			x++;
		System.out.println(x);
	}
}
