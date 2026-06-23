import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; ((n * i) + 2) < 10000; i++) {
			System.out.println((n * i) + 2);
		}
	}
}