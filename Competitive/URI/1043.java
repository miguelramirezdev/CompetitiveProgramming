import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double A = in.nextFloat();
		double B = in.nextFloat();
		double C = in.nextFloat();
		if ((A < (double) (B + C)) && (B < (double) (A + C)) && (C < (double) (B + A))) {
			double perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f\n", perimetro);

		} else {
			double area = ((A + B) * C) / 2;
			System.out.printf("Area = %.1f\n", area);
		}
	}
}