import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class inflation {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(in.readLine());
		int[] vec = new int[n];
		String[] vec1 = in.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			vec[i] = Integer.valueOf(vec1[i]);

		}

		Arrays.sort(vec);
		double aux = 1;
		for (int i = 0; i < n; i++) {
			if (vec[i] > i + 1) {
				System.out.println("impossible");
				return;
			}
			aux = Math.min(aux, (double) vec[i] / (i + 1));
		}
		System.out.println(aux);
	}

}
