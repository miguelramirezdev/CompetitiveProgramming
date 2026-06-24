import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double res=0;
		for (int i = 0; i < 2; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			double c=in.nextDouble();
			res+=(b*c);
		}
		System.out.printf("VALOR A PAGAR: R$ %.2f",res);
		System.out.println();
	}
}