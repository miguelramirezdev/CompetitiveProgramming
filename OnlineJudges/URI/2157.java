import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			String aux = "";
			for (int i = a; i <= b; i++) {
				System.out.print(i);
				aux = aux + i;
			}
			StringBuilder aux2 = new StringBuilder(aux);
			System.out.print(aux2.reverse() + "\n");
		}
	}
}
