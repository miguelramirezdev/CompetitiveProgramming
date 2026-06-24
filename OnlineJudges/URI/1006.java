import java.util.Scanner;

final class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double r = (a*2)+(b*3)+(c*5);
		System.out.printf("MEDIA = %.1f\n",r/10);
	}
}
