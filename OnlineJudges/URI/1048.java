import java.text.DecimalFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		Double n = in.nextDouble();
		if (n >= 0 && n <= 400.00) {
			System.out.println("Novo salario: " + df.format(n + (n * 0.15)));
			System.out.println("Reajuste ganho: " + df.format(n * 0.15));
			System.out.println("Em percentual: 15 %");
		} else if (n >= 400.01 && n <= 800.00) {
			System.out.println("Novo salario: " + df.format(n + (n * 0.12)));
			System.out.println("Reajuste ganho: " + df.format(n * 0.12));
			System.out.println("Em percentual: 12 %");
		} else if (n >= 800.01 && n <= 1200.00) {
			System.out.println("Novo salario: " + df.format(n + (n * 0.10)));
			System.out.println("Reajuste ganho: " + df.format(n * 0.10));
			System.out.println("Em percentual: 10 %");
		} else if (n >= 1200.01 && n <= 2000.00) {
			System.out.println("Novo salario: " + df.format(n + (n * 0.07)));
			System.out.println("Reajuste ganho: " + df.format(n * 0.07));
			System.out.println("Em percentual: 7 %");
		} else {
			System.out.println("Novo salario: " + df.format(n + (n * 0.04)));
			System.out.println("Reajuste ganho: " + df.format(n * 0.04));
			System.out.println("Em percentual: 4 %");
		}
	}
}
