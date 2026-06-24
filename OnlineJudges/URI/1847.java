import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if (a > b) {
			if (b > c) {
				if ((b - c) < (a - b)) {
					System.out.println(":)");
				} else {
					System.out.println(":(");
				}
			} else {
				System.out.println(":)");
			}
		} else if (b > a) {
			if (c > b) {
				if ((c - b) < (b - a)) {
					System.out.println(":(");
				} else {
					System.out.println(":)");
				}
			} else {
				System.out.println(":(");
			}
		} else if (c > b) {
			System.out.println(":)");
		} else {
			System.out.println(":(");
		}
	}
}