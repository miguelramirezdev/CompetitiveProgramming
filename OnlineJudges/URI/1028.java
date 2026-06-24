import java.util.*;

public class Main {

	public static int Euclides(int a, int b) {
		int r = b;
		while (b > 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return (a);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			int f1 = in.nextInt();
			int f2 = in.nextInt();
			System.out.println(Euclides(f1, f2));
		}
	}
}