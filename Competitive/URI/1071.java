import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int sum = 0;
		for (int i = Math.min(a, b) + 1; i < Math.max(a, b); i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum); 
	}
}
