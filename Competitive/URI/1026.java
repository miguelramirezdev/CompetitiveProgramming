import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			long x = in.nextLong();
			long y = in.nextLong();
			long a = x ^ y;
			System.out.println(a);
		}
	}
}