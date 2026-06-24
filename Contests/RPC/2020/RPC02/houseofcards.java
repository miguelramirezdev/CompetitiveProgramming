
import java.math.BigInteger;
import java.util.*;

public class houseofcards {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);

//		BigInteger aux = in.nextBigInteger();
//		System.out.println(aux.pow(1000));
		
		BigInteger n = in.nextBigInteger();
		BigInteger x = new BigInteger("5");
		BigInteger y = new BigInteger("8");
		while (!n.mod(y).equals(BigInteger.ZERO) && !(n.mod(y).equals(x))) {
			n = n.add(BigInteger.ONE);
		}
		System.out.println(n);
	}
}
