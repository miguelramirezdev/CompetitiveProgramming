import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int c = 0;
		for (int i = 0; i < 5; i++) {
			int a = in.nextInt();
			if (a == t) {
				c++;
			}
		}
		System.out.println(c);
	}
}