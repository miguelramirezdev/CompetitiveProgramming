import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int vec[] = new int[10];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = in.nextInt();
			if (vec[i] <= 0) {
				vec[i] = 1;
			}
		}
		for (int i = 0; i < vec.length; i++) {
			System.out.println("X[" + i + "] = " + vec[i]);
		}
	}
}