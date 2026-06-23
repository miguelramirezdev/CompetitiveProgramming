import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Aut o-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int x = Math.max(a, b);
		int y = Math.min(a, b)+1;
	
		for (int i = y; i < x; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
	}
}