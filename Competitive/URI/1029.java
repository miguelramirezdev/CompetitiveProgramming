import java.util.*;

public class Main {

	public static int a = 0;
	public static int b = 0;

	private static int fibo(int n) {
		if (n == 0) {
			a++;
			return 0;
		} else if (n == 1) {
			a++;
			b++;
			return 1;
		} else {
			a++;
			return fibo(n - 1) - fibo(n - 2);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			a = 0;
			b = 0;
			int x = in.nextInt();
			fibo(x);
			System.out.println("fib(" + x + ") = " + (a - 1) + " calls = " + b);
		}
	}
}
