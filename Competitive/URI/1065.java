import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int c = 0;
		for (int i = 0; i < 5; i++) {
			int n = in.nextInt();
			if (n % 2 == 0) {
				c++;
			}
		}
		System.out.println(c + " valores pares");
	}
}
