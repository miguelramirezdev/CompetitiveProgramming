import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = 1;
		int b = 60;
		for (int i = 0; i < 13; i++) {
			System.out.println("I=" + a + " J=" + b);
			a += 3;
			b -= 5;
		}
	}
}