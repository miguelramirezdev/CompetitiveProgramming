import java.text.DecimalFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			int a = in.nextInt(), b = in.nextInt();
			if (b == 0) {
				System.out.println("divisao impossivel");
			} else {
				double res = (double) a / b;
				DecimalFormat df = new DecimalFormat("0.0");
				System.out.println(df.format(res));
			}
		}
	}
}