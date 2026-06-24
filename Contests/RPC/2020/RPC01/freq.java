

import java.util.Scanner;

public class freq {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();

		int[] vec = new int[123];

		for (int i = 0; i < s.length(); i++) {
			vec[s.charAt(i)]++;
		}
		while (true) {
			int aux = 0;
			int aux1 = -1;
			for (int i = 97; i <= 122; i++) {
				if (vec[i] > aux) {
					aux = vec[i];
					aux1 = i;
				}
			}
			if (aux == 0) {
				break;
			}
			for (int j = 0; j < vec[aux1]; j++) {
				System.out.print((char) aux1);
			}
			vec[aux1] = 0;
		}
		System.out.println();
	}
}
