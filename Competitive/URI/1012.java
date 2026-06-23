import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		System.out.printf("TRIANGULO: %.3f\n", ((a * c) / 2));
		System.out.printf("CIRCULO: %.3f\n", (c * c * 3.14159));
		System.out.printf("TRAPEZIO: %.3f\n", (((a + b) / 2) * c));
		System.out.printf("QUADRADO: %.3f\n",( b * b));
		System.out.printf("RETANGULO: %.3f\n", (a * b));
	}
}