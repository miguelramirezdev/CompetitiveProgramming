import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int per[] = new int[n];
		for (int i = 0; i < per.length; i++) {
			per[i] = in.nextInt();
		}
		int aux = per[0];
		int c = 0;
		for (int i = 1; i < n; i++) {
			if (per[i] < aux) {
				aux = per[i];
				c = i;
			}
		}
		System.out.println(c + 1);
	}
}
