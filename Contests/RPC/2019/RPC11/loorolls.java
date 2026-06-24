
import java.util.Scanner;

public final class  loorolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long L = in.nextLong();
		long N = in.nextLong();
		int k = 1;
		while (L % N != 0) {
			N = N - L % N;
			k++;
		}
		System.out.println(k);
	}
}
