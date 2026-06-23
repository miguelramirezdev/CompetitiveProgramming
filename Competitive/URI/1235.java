import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();
		while (a-- > 0) {
			String cadena = in.nextLine();
			StringBuilder cad1 = new StringBuilder(cadena.substring(0, cadena.length() / 2));
			StringBuilder cad2 = new StringBuilder(cadena.substring(cadena.length() / 2, cadena.length()));
			System.out.println(cad1.reverse() + "" + cad2.reverse());
		}
	}
}
