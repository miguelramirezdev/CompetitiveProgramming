

import java.math.BigInteger;
import java.util.Scanner;

public class buildings {

	static final BigInteger MOD = BigInteger.valueOf(1000000007); 
	
	public static long gcd(long a, long b) {
		return (b == 0) ? Math.abs(a) : gcd(b, a % b);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long m = sc.nextLong();
		BigInteger c = sc.nextBigInteger();

		BigInteger col = c.modPow(BigInteger.valueOf(n * n), MOD);

		BigInteger sum = BigInteger.ZERO;
		for (long i = 0; i < m; i++) {

			BigInteger gcd = BigInteger.valueOf(gcd(m, i)); 
			BigInteger part = col.modPow(gcd, MOD);
			sum = sum.add(part);
		}
		BigInteger valm = BigInteger.valueOf(m);
		BigInteger minv = valm.modInverse(MOD);
		sum = sum.multiply(minv); 

		System.out.println(sum.mod(MOD));
		sc.close();
	}
}
