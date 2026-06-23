
import java.util.*;

public class speeding {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int T = 0, D = 0;
		int aux = 0;
		for (int i = 0; i < N; i++) {
			int T1 = s.nextInt(), D1 = s.nextInt();
			if (T1 == 0)
				continue;
			aux = Math.max(aux, (D1 - D) / (T1 - T));
			T = T1;
			D = D1;
		}
		System.out.println(aux);
	}
}
