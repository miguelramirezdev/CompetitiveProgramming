import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int salto = 0;
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			int aux = 0;
			String vec[] = new String[n];
			for (int i = 0; i < vec.length; i++) {
				vec[i] = in.next();
				aux = Math.max(aux, (int) vec[i].length());
			}
			if (salto != 0) {
				System.out.println();
			} else {
				salto = 1;
			}

			for (int i = 0; i < vec.length; i++) {
				System.out.println(String.format("%1$" + aux + "s", vec[i]));
			}
		}
	}
}