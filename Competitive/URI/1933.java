import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			if (a == b) {
				System.out.println(a);
			} else if (a > b) {
				System.out.println(a);
			} else if (a < b) {
				System.out.println(b);
			}
		}
	}
}