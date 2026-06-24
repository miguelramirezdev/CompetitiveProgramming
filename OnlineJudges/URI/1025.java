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
		int p = 0, aux = 1;
		while (in.hasNext()) {
			int n = in.nextInt();
			int q = in.nextInt();
			if (n == 0 && q == 0) {
				break;
			} else {
				int vec[] = new int[n];
				for (int i = 0; i < vec.length; i++) {
					vec[i] = in.nextInt();
				}
				Arrays.sort(vec);
				System.out.println("CASE# " + aux + ":");
				while (q-- > 0) {
					p = in.nextInt();
					if (bin(p, vec) != -1) {
						System.out.println(p + " found at " + bin(p, vec));
					} else {
						System.out.println(p + " not found");
					}
				}
				aux++;
			}
		}
	}
}