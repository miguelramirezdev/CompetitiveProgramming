
import java.util.*;

public class divide {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();

		int[] vec = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
			vec[i] = in.nextInt();
			total += vec[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.println((d / total) * vec[i]);
		}
	}
}
