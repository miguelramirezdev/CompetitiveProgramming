import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int c = 0;
		double sum = 0;
		for (int i = 0; i < 6; i++) {
			double n = in.nextDouble();
			if (n > 0) {
				sum += n;
				c++;
			}
		}
		System.out.println(c + " valores positivos");
		System.out.printf("%.1f", (sum / c));
		System.out.println();
	}
}
