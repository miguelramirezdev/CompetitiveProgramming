import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (x == 0) {
				System.out.println("NULL");
			} else if (x % 2 != 0 && x < 0) {
				System.out.println("ODD NEGATIVE");
			} else if (x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			} else if (x % 2 == 0 && x < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			}
		}
	}
}