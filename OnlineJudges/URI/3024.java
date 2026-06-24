import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int c = 0;
		int n = in.nextInt();
		int x = in.nextInt();
		int vec[] = new int[n];
		vec[0] = in.nextInt();
		int aux = 0;
		for (int i = 1; i < vec.length; i++) {
			vec[i] = in.nextInt();
			if (vec[i] - vec[i - 1] <= x) {
				c++;
				if (c >= aux) {
					aux = c;
				}
			} else {
				c = 0;
			}
		}
		System.out.println(aux + 1);
	}
}
