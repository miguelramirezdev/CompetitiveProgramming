import java.util.*;

public class Main {

	public static int bin(int x, int[] array) {
		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (array[mid] < x) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if (low == high && array[low] == x) {
			return low + 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int suma1 = 0;
		int vector1[] = new int[n];
		int vector2[] = new int[n + 1];
		vector2[n - 1] = 0;
		for (int i = 0; i < n; i++) {
			vector1[i] = in.nextInt();
			suma1 += vector1[i];
			vector2[i] = suma1;
		}
		Arrays.sort(vector2);
		if (suma1 % 2 == 1) {
			System.out.println("N");
		} else {
			int mitad = suma1 / 2, partes = 0, suma2 = 0;
			for (int i = 0; i < n; i++) {
				suma2 += vector1[i];
				int elemento = (suma2 + mitad) % suma1;
				if (bin(elemento, vector2) != -1) {
					partes++;
				}
			}
			if (partes >= 4) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}
}
