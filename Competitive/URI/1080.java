import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int vec1[] = new int[100];
		int vec2[] = new int[100];
		for (int i = 0; i < vec1.length; i++) {
			vec1[i] = in.nextInt();
			vec2[i] = vec1[i];
		}
		Arrays.sort(vec1);
		int aux = 0;
		for (int i = 0; i < vec2.length; i++) {
			if (vec2[i] == vec1[99]) {
				aux = i;
				break;
			}
		}
		System.out.println(vec1[99]);
		System.out.println(aux+1);
	}
}
