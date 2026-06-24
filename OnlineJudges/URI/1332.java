import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			String cad = in.next();
			if (cad.length() == 5) {
				System.out.println("3");
			} else if ((cad.charAt(0) == 't' && cad.charAt(1) == 'w') || (cad.charAt(0) == 't' && cad.charAt(2) == 'o')
					|| (cad.charAt(1) == 'w' && cad.charAt(2) == 'o')) {
				System.out.println("2");
			} else {
				System.out.println("1");
			}
		}
	}
}
