
import java.util.*;

public class ballpark {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		long x = in.nextLong();
		long aux = 1;
		double y = (double) x;
		while (x >= 10) {
			y /= 10;
			x /= 10;
			aux *= 10;
		}
		x = Math.round(y);
		System.out.println(x * aux);

	}
}