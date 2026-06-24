import java.util.Scanner;
final class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a = in.nextDouble();
		System.out.printf("A=%.4f\n",(3.14159*(Math.pow(a, 2))));
	}
}
