import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			double n = in.nextDouble();
			double r = Math.sqrt(3) / 4.00;
			double area = r * n * n;
			System.out.printf("%.2f", area * 1.6);
			System.out.println();
		}
	}
}