import java.util.Scanner;
final class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double r = (a*3.5)+(b*7.5);
		System.out.printf("MEDIA = %.5f\n",r/11);
	}
}