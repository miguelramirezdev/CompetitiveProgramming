
import java.math.BigInteger;
import java.util.*;

public class barrels {

	static final int MOD = 1_000_000_007;

	public static int ver() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt(), k = in.nextInt(), c = in.nextInt();
		if (c != a && c != b)
			return 0;
		if (a == b)
			return k;
		BigInteger mul = BigInteger.ONE;
		for (int i = 1; i < k; ++i)
			mul = mul.add(mul);
		return mul.multiply(BigInteger.valueOf(k)).mod(BigInteger.valueOf(MOD)).intValue();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ver());
	}
}
