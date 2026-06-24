import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long vec[] = new long[61];
		vec[0] = 0;
		vec[1] = 1;
		for (int i = 2; i < vec.length; i++) {
			vec[i] = vec[i - 1] + vec[i - 2];
		}
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			System.out.println("Fib(" + n + ") = " + vec[n]);
		}
	}
}