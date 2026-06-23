import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = 6;
		while (x != 0) {
			if (n % 2 == 1) {
				System.out.println(n);
				x--;
			}
			n += 1;
		}
	}
}
