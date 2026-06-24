import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		if (x < y) {
			if (y % x == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		} else {
			if (x % y == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		}
	}
}
