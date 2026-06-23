import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		double salary = in.nextDouble();
		double value = in.nextDouble();
		double TOTAL = salary + value * 0.15;
		System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
	}

}