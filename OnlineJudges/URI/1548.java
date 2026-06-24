import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			int m = in.nextInt();
			int vec1[] = new int[m];
			int vec2[] = new int[m];
			for (int i = 0; i < vec1.length; i++) {
				vec1[i] = in.nextInt();
				vec2[i] = vec1[i];
			}
			Arrays.sort(vec1);
			int c = 0, x = 0;
			for (int i = vec1.length - 1; i >= 0; i--) {
				if (vec1[i] == vec2[x]) {
					c++;
				}
				x++;
			}
			System.out.println(c);
		}
	}
}