
import java.math.BigInteger;
import java.util.Scanner;

public class inquiry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		BigInteger suma1 = BigInteger.ZERO;

		BigInteger sumaex = BigInteger.ZERO;
		BigInteger aux = BigInteger.ZERO;

		int n = in.nextInt();
		int vec[] = new int[n];

		for (int i = 0; i < vec.length; i++) {
			vec[i] = in.nextInt();
			suma1 = suma1.add(BigInteger.valueOf(vec[i]));
		}
		for (int i = 0; i < vec.length-1; i++) {
			sumaex = sumaex.add(BigInteger.valueOf((int) Math.pow(vec[i], 2)));
			suma1 = suma1.subtract(BigInteger.valueOf(vec[i]));
			if ((sumaex.multiply(suma1)).compareTo(aux) == -1) {
				continue;
			}
			aux = (sumaex.multiply(suma1));
		}
		System.out.println(aux);
	}

}
