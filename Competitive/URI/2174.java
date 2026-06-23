import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		TreeSet<String> Y = new TreeSet<String>();
		while (n-- > 0) {
			String pokemon = in.next();
			Y.add(pokemon);
		}
		int faltan = 151 - Y.size();
		System.out.println("Falta(m) " + faltan + " pomekon(s).");
	}
}