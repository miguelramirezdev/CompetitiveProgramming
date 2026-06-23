import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		while (n-- > 0) {
			String cade = in.next();
			String aux = "";
			for (int i = 0; i < cade.length(); i++) {
				if (Character.isAlphabetic(cade.charAt(i))) {
					aux += "@";
				} else {
					aux += cade.charAt(i);
				}
			}
			aux = aux.trim();
			String vec[] = aux.split("@");
			int sum = 0;
			for (int i = 0; i < vec.length; i++) {
				if (vec[i].equals("")) {

				} else {
					// System.out.println(i + " " + vec[i]);
					sum += Integer.parseInt(vec[i]);
				}
			}
			System.out.println(sum);
		}
	}
}
