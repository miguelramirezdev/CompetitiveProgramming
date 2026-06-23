import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			String a = in.next();
			String b = in.next();
			if (a.length() < b.length()) {
				System.out.println("nao encaixa");
			} else {
				if (a.substring((a.length() - b.length()), a.length()).equals(b)) {
					System.out.println("encaixa");
				} else {
					System.out.println("nao encaixa");
				}
			}
		}
	}
}
