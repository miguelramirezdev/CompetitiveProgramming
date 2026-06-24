import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String cadena = in.next().toLowerCase();
		System.out.println(cadena.contains("zelda") ? "Link Bolado": "Link Tranquilo");
	}
}
