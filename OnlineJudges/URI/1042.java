import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int vec1[] = new int[3];
		int vec2[] = new int[3];
		for (int i = 0; i < vec1.length; i++) {
			vec1[i] = in.nextInt();
			vec2[i] = vec1[i];
		}
		Arrays.sort(vec1);
		for (int i = 0; i < vec1.length; i++) {
			System.out.println(vec1[i]);
		}
		System.out.println();
		for (int i = 0; i < vec2.length; i++) {
			System.out.println(vec2[i]);
		}
	}
}