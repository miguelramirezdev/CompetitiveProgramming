
import java.util.*;

public class deceptive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();

		double old_ex = 0.0;

		for (int i = 0; i < k; i++) {
			double new_ex = 0.0;
			for (int j = 1; j <= n; j++) {
				if (j > old_ex)
					new_ex += j;
				else
					new_ex += old_ex;
			}
			new_ex = new_ex / n;
			old_ex = new_ex;
		}

		System.out.println(old_ex);
	}
}
