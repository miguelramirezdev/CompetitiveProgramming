import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double vec[] = { 4.00, 4.50, 5.00, 2.00, 1.50 };
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("Total: R$ %.2f\n", (vec[x - 1] * y));
	}
}