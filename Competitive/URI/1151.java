import java.util.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger vfibo[] = new BigInteger[50];
		vfibo[0] = BigInteger.valueOf(0);
		vfibo[1] = BigInteger.valueOf(1);
		for (int i = 2; i < vfibo.length; i++) {
			vfibo[i] = vfibo[i - 1].add(vfibo[i - 2]);
		}
		int n = in.nextInt();
		String cad = "";
		for (int i = 0; i < n; i++) {
			cad += String.valueOf(vfibo[i]) + " ";
		}
		System.out.println(cad.trim());
	}
}