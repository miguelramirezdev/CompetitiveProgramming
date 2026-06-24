import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int c = 0;
		for (int i = 0; i < 6; i++) {
			double n = in.nextDouble();
			if (n > 0) {
				c++;
			}
		}
		System.out.println(c + " valores positivos");
	}
}