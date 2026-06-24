import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = 0;
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (x >= 10 && x <= 20) {
				c++;
			}
		}
		System.out.println(c + " in");
		System.out.println((n - c) + " out");
	}
}
