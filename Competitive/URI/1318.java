import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int m = in.nextInt();
			int c = 0;
			if (n == 0 && m == 0) {
				break;
			}
			int vec[] = new int[m + 1];
			for (int i = 0; i < m; i++) {
				int t = in.nextInt();
				vec[t - 1]++;
			}
			for (int i = 0; i < vec.length; i++) {
				if (vec[i] >= 2) {
					c++;
				}
			}
			System.out.println(c);
		}
	}
}